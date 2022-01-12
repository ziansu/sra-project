public boolean isVoxelVisible(int color) {
    int alpha = color & 255;
    boolean visible;
    if ((visibilityMaskEncoded) == (QBLoader.VISIBILITY_VOXEL)) {
        visible = (alpha == 0) ? false : true;
    }else {
        visible = ((alpha | (QBLoader.SIDE_MASK_INVISIBLE)) == (QBLoader.SIDE_MASK_INVISIBLE)) ? false : true;
    }
    return visible;
}