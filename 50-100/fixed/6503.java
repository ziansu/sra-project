private void reverse(int[] input, int start, int end) {
    for (int i = start, j = end; i < j; ++i , --j) {
        int temp = input[i];
        input[i] = input[j];
        input[j] = temp;
    }
}