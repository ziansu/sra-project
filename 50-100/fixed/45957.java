public void updateIsAbove() {
    if ((head.getPosition()[0]) == 0) {
        this.isAbove = false;
    }else {
        if ((gameboard.getSquares()[((head.getPosition()[0]) + 1)][head.getPosition()[1]]) > 0) {
            this.isAbove = true;
        }else {
            this.isAbove = false;
        }
    }
}