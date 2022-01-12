private static float findMax(java.util.ArrayList<java.lang.Float> list, int targetIndex) {
    float max = -1.0F;
    for (int a = 0; a <= targetIndex; a++) {
        if ((list.get(a)) > max) {
            max = list.get(a);
        }
    }
    return max;
}