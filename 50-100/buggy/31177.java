public static void printElegantly(int[] array) {
    for (int i = 0; i < (array.length); i++) {
        if (i == (array.length)) {
            java.lang.System.out.print(array[i]);
        }else {
            java.lang.System.out.print(((array[i]) + ", "));
        }
    }
}