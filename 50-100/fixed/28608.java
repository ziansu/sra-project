private boolean isBoundary(int[] cd1, int[] cd2) {
    int count = 0;
    for (int i = 0; i < (cd1.length); i++) {
        if (((cd1[i]) + (cd2[i])) > 0) {
            if ((++count) > 1) {
                return true;
            }
        }
    }
    return false;
}