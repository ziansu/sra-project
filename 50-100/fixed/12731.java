private boolean checkMove(float x, float y, float oldX, float oldy) {
    return ((java.lang.Math.pow(java.lang.Math.abs((x - oldX)), 2)) + (java.lang.Math.pow(java.lang.Math.abs((y - oldy)), 2))) > (java.lang.Math.pow(mSlopeDistance, 2));
}