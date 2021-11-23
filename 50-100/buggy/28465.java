public static void printTarget(Node[][] map, int row, int col) {
    java.lang.System.out.println("This is where another Error occurs. the Error here is that true is printed on all terrain types, which is logically impossible (should be true on cell map[rand1][rand2], and false in all other)");
    for (int i = 0; i < row; i++) {
        for (int j = 0; j < col; j++) {
            java.lang.System.out.print(((map[i][j].target) + "   "));
        }
        java.lang.System.out.println();
    }
    java.lang.System.out.println();
}