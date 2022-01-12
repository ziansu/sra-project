private static boolean divide(java.util.List<java.lang.Integer> values, int checkValue) {
    int start = values.get(0);
    if (start == 0) {
        return false;
    }
    for (int k = 1; k < (values.size()); k++) {
        if ((values.get(k)) == 0) {
            return false;
        }
        start = start / (values.get(k));
    }
    return start == checkValue;
}