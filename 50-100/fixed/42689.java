public static void printTerrain(Node[][] map, int row, int col) {
    for (int i = 0; i < row; i++) {
        for (int j = 0; j < col; j++) {
            java.lang.System.out.print(((map[i][j].status) + "   "));
        }
        java.lang.System.out.println();
    }
    java.lang.System.out.println();
}