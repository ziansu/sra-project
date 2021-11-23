private int countAreas(int[][] array) {
    boolean[][] checked = new boolean[size][size];
    for (int i = 0; i < (size); i++) {
        for (int j = 0; j < (size); j++) {
            checked[i][j] = false;
        }
    }
    return countAreas(array, checked);
}