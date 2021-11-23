public static void printTerrain(Node[][] map, int row, int col) {
    java.lang.System.out.println("This is where Error occurs. the pattern here is that only the terrain type of the last cell in the map (that is, cell at map[row-1][col-1]) gets printed");
    for (int i = 0; i < row; i++) {
        for (int j = 0; j < col; j++) {
            java.lang.System.out.print(((map[i][j].status) + "   "));
        }
        java.lang.System.out.println();
    }
    java.lang.System.out.println();
}