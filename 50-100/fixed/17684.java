public void updateIsBelow() {
    if ((head.getPosition()[0]) == ((gameboard.getSquares().length) - 1)) {
        this.isBelow = false;
    }else {
        if ((gameboard.getSquares()[((head.getPosition()[0]) - 1)][head.getPosition()[1]]) > 0) {
            this.isBelow = true;
        }else {
            this.isBelow = false;
        }
    }
}