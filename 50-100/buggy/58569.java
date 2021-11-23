public static void printArray(char[][] array, int size, FromFile FF) {
    for (int i = 0; i < (FF.size); i++) {
        java.lang.System.out.print("\t");
        for (int j = 0; j < (FF.size); j++) {
            java.lang.System.out.print(FF.map[i][j]);
        }
        java.lang.System.out.println();
    }
}