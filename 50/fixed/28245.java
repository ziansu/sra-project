javax.vecmath.Point2d getSubBlockTextureOffset(int ind) {
    return new javax.vecmath.Point2d(((subBlockSize()) * (ind % 12)), ((subBlockSize()) * (ind / 12)));
}