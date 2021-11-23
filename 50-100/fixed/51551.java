public static int[] mineCreatorY() {
    int[] a = new int[9];
    for (int i = 0; i < 9; i++) {
        a[i] = ((int) ((java.lang.Math.random()) * 9));
    }
    return a;
}