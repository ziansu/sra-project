public double getLandingLocationX() {
    net.minecraftforge.common.util.ForgeDirection facing = zmaster587.libVulpes.block.RotatableBlock.getFront(worldObj.getBlockMetadata(xCoord, yCoord, zCoord));
    return (((xCoord) + ((facing.offsetX) * (-3))) + (facing.offsetZ)) + 0.5;
}