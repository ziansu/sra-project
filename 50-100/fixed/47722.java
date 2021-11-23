public static void printArray(double[] array, int left, int right) {
    java.lang.System.out.print("[");
    int i = left;
    for (; i < right; i++)
        java.lang.System.out.print(((array[i]) + "; "));
    
    java.lang.System.out.println(((array[i]) + "]"));
}