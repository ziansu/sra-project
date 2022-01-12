public void updateIsLeft() {
    if ((head.getPosition()[1]) == 0) {
        this.isLeft = false;
    }else {
        if ((gameboard.getSquares()[head.getPosition()[0]][((head.getPosition()[1]) - 1)]) == 1) {
            this.isLeft = true;
        }else {
            this.isLeft = false;
        }
    }
}