public void setNextTetromino() {
    this.nextTetrominoName = this.game.getNextTetromino();
    this.nextTetrominoName = this.pathFiltering(this.nextTetrominoName).toLowerCase(java.util.Locale.getDefault());
    int drawableId = this.nameToBitmapID.get(((this.nextTetrominoName) + "0"));
    this.nextTetrominoView.setImageResource(drawableId);
    this.log.toLog(this, ((("Next Tetromino name " + (this.nextTetrominoName)) + " id: ") + drawableId));
}