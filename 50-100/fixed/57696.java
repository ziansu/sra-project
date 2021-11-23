public static int[] lexicographicPermutations(int digit, int term) {
    int[] array = new int[digit];
    for (int i = 0; i < digit; i++) {
        array[i] = i;
    }
    for (long j = 0; j < term; j++) {
        array = nextLexicographicOrder(array);
    }
    return array;
}