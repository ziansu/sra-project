private static int[] addOne(int[] a) {
    int len = a.length;
    for (int i = len - 1; i >= 0; i--) {
        if ((a[i]) < 9) {
            (a[i])++;
            return a;
        }else {
            a[i] = 0;
        }
    }
    a = new int[len + 1];
    a[0] = 1;
    return a;
}