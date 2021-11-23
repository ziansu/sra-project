public static void printElegantly(int[] array) {
    for (int i = 0; i < (array.length); i++) {
        if (i == ((array.length) - 1)) {
            java.lang.System.out.print(array[i]);
        }else {
            java.lang.System.out.print(((array[i]) + ", "));
        }
    }
    java.lang.System.out.println();
}