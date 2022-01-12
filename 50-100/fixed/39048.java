private void print() {
    for (int row = 0; row < (this.grid[0].length); row++) {
        for (int column = 0; column < (this.grid[0].length); column++) {
            java.lang.System.out.print(((this.grid[row][column]) + " "));
        }
        java.lang.System.out.println();
    }
    java.lang.System.out.println();
}