private int howManyFlips() {
    checkBottom();
    boolean changeOrientation = this.pancakeStatus.get(0);
    int counter = 0;
    for (int i = 0; i < (this.pancakeStatus.size()); i++) {
        if ((this.pancakeStatus.get(i)) != changeOrientation) {
            counter++;
            changeOrientation = !changeOrientation;
        }
    }
    return counter;
}