public static int find(int[] a) {
    int current = a[0];
    int count = 1;
    for (int i = 1; i < (a.length); ++i) {
        if ((a[i]) == current) {
            count++;
        }else {
            count--;
            if (count < 0) {
                current = a[i];
                count = 1;
            }
        }
    }
    return current;
}