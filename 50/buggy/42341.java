public void unSelect() {
    this.isSelected = false;
    changeState(this.squareState);
    selectedSquares.remove(selectedSquares.indexOf(this));
}