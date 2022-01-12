public static int[] mineCreatorY() {
    int[] a = new int[9];
    for (int i = 0; i < 9; i++) {
        a[i] = ((int) ((java.lang.Math.random()) * 9));
        for (int j = 0; j < i; j++) {
            if ((a[i]) == (a[j])) {
                i--;
                break;
            }
        }
    }
    return a;
}