@java.lang.Override
public net.minecraft.util.EnumActionResult onItemUse(net.minecraft.entity.player.EntityPlayer player, net.minecraft.world.World world, net.minecraft.util.math.BlockPos pos, net.minecraft.util.EnumHand hand, net.minecraft.util.EnumFacing side, float hitX, float hitY, float hitZ) {
    java.lang.System.out.printf("HammerItem.onItemUse\n");
    com.elytradev.architecture.common.tile.TileShape te = com.elytradev.architecture.common.tile.TileShape.get(world, pos);
    if (te != null) {
        java.lang.System.out.printf("HammerItem.onItemUse: te = %s\n", te);
        te.onHammerUse(player, side, hitX, hitY, hitZ);
        return net.minecraft.util.EnumActionResult.SUCCESS;
    }
    return net.minecraft.util.EnumActionResult.FAIL;
}