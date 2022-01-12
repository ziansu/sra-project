private static boolean windowIsInsideVolume(int[] ub, int[] pos) {
    for (int i = 0; i < (ub.length); i++) {
        if ((pos[i]) > (ub[i])) {
            return false;
        }
    }
    return true;
}