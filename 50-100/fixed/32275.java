static int birthdayCakeCandles(int n, int[] ar) {
    int max = ar[0];
    int result = 0;
    for (int i = 0; i < n; i++) {
        if ((ar[i]) > max) {
            max = ar[i];
        }
    }
    for (int j = 0; j < n; j++) {
        if ((ar[j]) == max) {
            result++;
        }
    }
    return result;
}