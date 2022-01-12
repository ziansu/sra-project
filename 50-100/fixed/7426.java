@java.lang.Override
protected int getZWithOffset(int x, int z) {
    net.minecraft.util.EnumFacing enumfacing = this.getCoordBaseMode();
    if (enumfacing == null) {
        return z;
    }else {
        switch (enumfacing) {
            case SOUTH :
                return (this.boundingBox.minZ) + z;
            case WEST :
                return (this.boundingBox.minZ) + x;
            case NORTH :
                return (this.boundingBox.maxZ) - z;
            case EAST :
                return (this.boundingBox.maxZ) - x;
            default :
                return z;
        }
    }
}