public void printGrid() {
    java.lang.String gridString = "";
    for (int i = 0; i < (numberGridColumns); ++i) {
        gridString += "[";
        for (int j = 0; j < (numberGridRows); ++j) {
            gridString += (grid[i][j]) + " ";
        }
        gridString += "]\n";
    }
    java.lang.System.out.println(gridString);
}