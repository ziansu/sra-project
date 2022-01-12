private void onGameOver(android.graphics.Canvas canvas) {
    canvas.drawText(getContext().getString(R.string.game_over_text), ((startP_) + ((cellSize_) * 2.5F)), ((startP_) + ((cellSize_) * 4.7F)), noticePaint_);
}