@java.lang.Override
protected int getZWithOffset(int x, int z) {
    net.minecraft.util.EnumFacing enumfacing = this.getCoordBaseMode();
    if (enumfacing == null) {
        return z;
    }else {
        switch (enumfacing) {
            case NORTH :
                return (this.boundingBox.maxZ) - z;
            case SOUTH :
                return (this.boundingBox.minZ) + z;
            case WEST :
            case EAST :
                return (this.boundingBox.minZ) + x;
            default :
                return z;
        }
    }
}