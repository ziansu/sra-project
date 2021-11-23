@java.lang.Override
public boolean onItemUse(net.minecraft.item.ItemStack stack, @org.jetbrains.annotations.NotNull
net.minecraft.entity.player.EntityPlayer playerIn, @org.jetbrains.annotations.NotNull
net.minecraft.world.World worldIn, @org.jetbrains.annotations.NotNull
net.minecraft.util.BlockPos pos, net.minecraft.util.EnumFacing side, float hitX, float hitY, float hitZ) {
    playerIn.triggerAchievement(ModAchievements.achievementWandOfbuilding);
    if (worldIn.isRemote) {
        MineColonies.proxy.openBuildToolWindow(pos.offset(side));
        return true;
    }
    return false;
}