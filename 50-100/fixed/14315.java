public static int findDup2(int[] arr) {
    for (int n : arr) {
        int t = (n < 0) ? n * (-1) : n;
        arr[t] *= -1;
    }
    for (int i = 0; i < (arr.length); i++) {
        if ((arr[i]) > 0)
            return i;
        
    }
    return 0;
}