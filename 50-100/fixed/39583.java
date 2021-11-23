@java.lang.Override
public boolean isUsableByPlayer(@javax.annotation.Nonnull
net.minecraft.entity.player.EntityPlayer player) {
    return ((world.getTileEntity(pos)) == (this)) && ((player.getDistanceSq(((pos.getX()) + 0.5), ((pos.getY()) + 0.5), ((pos.getZ()) + 0.5))) <= 64.0);
}