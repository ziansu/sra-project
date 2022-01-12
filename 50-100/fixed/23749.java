public static int[] permutation(int n) {
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
        arr[i] = i;
    }
    org.semux.utils.ArrayUtil.shuffle(arr);
    return arr;
}