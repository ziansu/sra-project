private void print() {
    for (int column = 0; column < (this.grid[this.row].length); column++) {
        java.lang.System.out.print(((this.grid[this.row][column]) + " "));
    }
    java.lang.System.out.println();
}