public static float getDistance(final float x1, final float y1, final float x2, final float y2) {
    float x = x1 - x2;
    float y = y1 - y2;
    float d = (x * x) + (y * y);
    return ((float) (java.lang.Math.abs(java.lang.Math.sqrt(d))));
}