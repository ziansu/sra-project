private int howManyFlips() {
    checkBottom();
    if (this.pancakeStatus.isEmpty()) {
        return 0;
    }
    boolean changeOrientation = this.pancakeStatus.get(0);
    int counter = 1;
    for (int i = 0; i < (this.pancakeStatus.size()); i++) {
        if ((this.pancakeStatus.get(i)) != changeOrientation) {
            counter++;
            changeOrientation = !changeOrientation;
        }
    }
    return counter;
}