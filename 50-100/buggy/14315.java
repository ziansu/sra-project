public static int findDup2(int[] arr) {
    for (int n : arr) {
        int t = (n < 0) ? n * (-1) : n;
        arr[t] *= -1;
    }
    for (int n : arr) {
        if (n > 0)
            return n;
        
    }
    return 0;
}