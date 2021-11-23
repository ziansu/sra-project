void printArray(int[] array) {
    for (int i = 0; i < (array.length); i++) {
        java.lang.System.out.print(array[i]);
        if (i != ((array.length) - 1)) {
            java.lang.System.out.print(" ");
        }
    }
}