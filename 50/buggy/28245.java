javax.vecmath.Point2d getSubBlockTextureOffset(int ind) {
    int x = ind % 12;
    int y = ind / 12;
    return new javax.vecmath.Point2d(((subBlockSize()) * x), ((subBlockSize()) * y));
}