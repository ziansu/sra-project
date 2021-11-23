private static boolean divide(java.util.List<java.lang.Integer> values, int checkValue) {
    int start = values.get(0);
    for (int k = 1; k < (values.size()); k++) {
        start = start / (values.get(k));
    }
    return start == checkValue;
}