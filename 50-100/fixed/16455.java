private static boolean twoOutOfThreeSame(int i1, int i2, int i3, int k1, int k2, int k3) {
    return (((i1 == k1) && (i2 == k2)) || ((i1 == k1) && (i3 == k3))) || ((i2 == k2) && (i3 == k3));
}