public double getLandingLocationX() {
    net.minecraft.util.EnumFacing facing = zmaster587.libVulpes.block.RotatableBlock.getFront(worldObj.getBlockState(getPos()));
    return (((getPos().getX()) + ((facing.getFrontOffsetX()) * (-3))) + (facing.getFrontOffsetZ())) + 0.5;
}