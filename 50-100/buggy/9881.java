@java.lang.Override
public boolean onItemUse(net.minecraft.item.ItemStack stack, @org.jetbrains.annotations.NotNull
net.minecraft.entity.player.EntityPlayer playerIn, @org.jetbrains.annotations.NotNull
net.minecraft.world.World worldIn, @org.jetbrains.annotations.NotNull
net.minecraft.util.BlockPos pos, net.minecraft.util.EnumFacing side, float hitX, float hitY, float hitZ) {
    if (!(worldIn.isRemote)) {
        return false;
    }
    playerIn.triggerAchievement(ModAchievements.achievementWandOfbuilding);
    MineColonies.proxy.openBuildToolWindow(pos.offset(side));
    return false;
}