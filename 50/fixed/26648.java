public void setToNormalColor() {
    this.color = (((((this.file) - 97) + (this.rank)) % 2) == 0) ? com.chessEngine.game.Square.LIGHT : com.chessEngine.game.Square.DARK;
}