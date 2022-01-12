public static void printArrayAsStars(int[] array) {
    for (int i = 0; i < (array.length); i++) {
        java.lang.System.out.println();
        for (int j = 0; j < (array[i]); j++) {
            java.lang.System.out.print("*");
        }
    }
    java.lang.System.out.println();
}