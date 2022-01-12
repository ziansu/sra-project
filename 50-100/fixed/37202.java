private static boolean windowIsInsideVolume(int[] ub, int[] pos) {
    for (int i = (ub.length) - 1; i >= 0; i--) {
        if ((pos[i]) > (ub[i])) {
            return false;
        }
    }
    return true;
}