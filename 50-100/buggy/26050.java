@java.lang.Override
public boolean canInteractWith(net.minecraft.entity.player.EntityPlayer entityPlayer) {
    return ((theWorld.getBlock(x, y, z)) instanceof vdvman1.betterAnvil.block.BlockAnvilBA) && ((entityPlayer.getDistanceSq((((double) (this.x)) + 0.5), (((double) (this.y)) + 0.5), (((double) (this.z)) + 0.5))) <= 64.0);
}