public boolean forceMove(player.Move m) {
    if (this.currentBoard.isValidMove(this.machineColor, m)) {
        this.currentBoard.move(m, this.machineColor);
        return true;
    }
    return false;
}