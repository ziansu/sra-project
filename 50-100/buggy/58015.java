public static void PrintMatrix(int[][] m) {
    int size = m.length;
    for (int i = 0; i < size; i++) {
        for (int j = 0; j < size; j++) {
            java.lang.System.out.print(((m[i][j]) + "\t"));
        }
        java.lang.System.out.print("\n");
    }
    java.lang.System.out.print("\n");
}