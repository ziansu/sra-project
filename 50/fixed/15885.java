private int getPixelSize(int i, int blockPixelSize, int offSet) {
    if (i < offSet) {
        return blockPixelSize + 1;
    }else {
        return blockPixelSize;
    }
}