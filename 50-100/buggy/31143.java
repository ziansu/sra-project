private void drawReplayStatus(android.graphics.Canvas canvas) {
    canvas.drawText(com.playxiangqi.hoxchess.HoxApp.getApp().getString(R.string.replay_text, ((historyIndex_) + 1), historyMoves_.size()), ((startP_) + ((cellSize_) * 2.5F)), ((startP_) + ((cellSize_) * 4.7F)), noticePaint_);
}