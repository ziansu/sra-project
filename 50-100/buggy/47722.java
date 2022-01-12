public static void printArray(double[] array, int left, int right) {
    java.lang.System.out.print("[");
    for (int i = left; i < (right + 1); i++) {
        java.lang.System.out.print(((array[i]) + "; "));
    }
    java.lang.System.out.println("]");
}