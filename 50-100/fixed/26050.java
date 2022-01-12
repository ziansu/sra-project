@java.lang.Override
public boolean canInteractWith(net.minecraft.entity.player.EntityPlayer entityPlayer) {
    return ((theWorld.getBlock(x, y, z)) instanceof vdvman1.betterAnvil.block.BlockAnvilBA) && ((entityPlayer.getDistanceSq(((x) + 0.5), ((y) + 0.5), ((z) + 0.5))) <= 64.0);
}