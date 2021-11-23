@java.lang.Override
public boolean removedByPlayer(net.minecraft.world.World world, net.minecraft.entity.player.EntityPlayer player, int x, int y, int z) {
    if ((world.getBlockMetadata(x, y, z)) > 0)
        return false;
    
    return super.removedByPlayer(world, player, x, y, z, true);
}