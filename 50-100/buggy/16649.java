public void transpose() {
    for (int y = 0; y < 8; y++) {
        for (int x = 0; x < 8; x++) {
            this.swap(x, y, y, x);
        }
    }
}