public static int[] generateDescending(int size) {
    int[] tab = new int[size];
    for (int i = 0; i < size; i++) {
        tab[i] = size - i;
    }
    return tab;
}