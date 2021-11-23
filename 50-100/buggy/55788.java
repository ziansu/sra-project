public void clear() {
    for (int i = 0; i < (this.grid.length); i++) {
        for (int j = 0; j < (this.grid[0].length);) {
            set(0, y, x);
        }
    }
}