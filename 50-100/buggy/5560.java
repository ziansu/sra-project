@java.lang.Override
protected int getXWithOffset(int x, int z) {
    net.minecraft.util.EnumFacing enumfacing = this.getCoordBaseMode();
    if (enumfacing == null) {
        return x;
    }else {
        switch (enumfacing) {
            case NORTH :
                return (this.boundingBox.maxX) - x;
            case SOUTH :
                return (this.boundingBox.minX) + x;
            case WEST :
                return (this.boundingBox.maxX) - z;
            case EAST :
                return (this.boundingBox.minX) + z;
            default :
                return x;
        }
    }
}