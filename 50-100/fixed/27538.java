private static float findMin(java.util.ArrayList<java.lang.Float> list, int targetIndex) {
    float min = 1.0E9F;
    for (int a = 0; a <= targetIndex; a++) {
        if ((list.get(a)) < min) {
            min = list.get(a);
        }
    }
    return min;
}