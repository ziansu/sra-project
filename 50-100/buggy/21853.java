public static boolean checkMissingInRow(int i, int j, de.halemba.elements.Field[][] grid) {
    for (int k = 0; k < 9; k++) {
        if ((grid[k][j].getNumber()) == i) {
            return false;
        }
    }
    return true;
}