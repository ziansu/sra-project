public void checkWin() {
    if (this.mainHopscotch.checkWin()) {
        win();
    }
    this.mainHopscotch.clearChecked();
}