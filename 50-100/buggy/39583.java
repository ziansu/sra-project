@java.lang.Override
public boolean isUsableByPlayer(net.minecraft.entity.player.EntityPlayer player) {
    return ((world.getTileEntity(pos)) == (this)) && ((player.getDistanceSq((((double) (pos.getX())) + 0.5), (((double) (pos.getY())) + 0.5), (((double) (pos.getZ())) + 0.5))) <= 64.0);
}