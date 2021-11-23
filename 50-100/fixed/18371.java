public void printGrid() {
    java.lang.String gridString = "";
    for (int i = 0; i < (numberGridRows); ++i) {
        gridString += "[";
        for (int j = 0; j < (numberGridColumns); ++j) {
            gridString += (grid[j][i]) + " ";
        }
        gridString += "]\n";
    }
    java.lang.System.out.println(gridString);
}