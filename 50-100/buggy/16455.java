private static boolean twoOutOfThreeSame(int i1, int i2, int i3, int k1, int k2, int k3) {
    if ((i1 == k1) || (i2 == k2)) {
        return true;
    }
    if ((i1 == k1) || (i3 == k3)) {
        return true;
    }
    if ((i2 == k2) || (i3 == k3)) {
        return true;
    }
    return false;
}