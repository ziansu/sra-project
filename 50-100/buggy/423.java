private static int recursiveCutRod(int[] a, int len) {
    if (len == 0) {
        return 0;
    }else {
        int max = -1;
        for (int i = 0; i < len; i++) {
            max = java.lang.Math.max(max, ((prac2.Tasks.recursiveCutRod(a, ((len - i) - 1))) + (a[i])));
        }
        return max;
    }
}