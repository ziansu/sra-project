public static float[] getMaxAndMin(float[] floats) {
    float max = 0;
    float min = floats[0];
    float[] min_max = new float[2];
    for (float f : floats) {
        if (f > max) {
            max = f;
        }else {
            if (f < min) {
                min = f;
            }
        }
    }
    min_max[0] = max;
    min_max[1] = min;
    return min_max;
}