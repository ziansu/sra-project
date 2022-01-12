private static void printMatrix(int[][] m) {
    for (int i = 0; i < (m[0].length); i++) {
        for (int j = 0; j < (m.length); j++) {
            java.lang.System.out.print(((m[j][i]) + "\t"));
        }
        java.lang.System.out.print("\n");
    }
    java.lang.System.out.print("\n");
}