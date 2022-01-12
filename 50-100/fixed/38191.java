private void Update() {
    playFieldView.field = model.field;
    playFieldView.currentBlock = model.currentBlock;
    nextBlockPreview.nextBlock = model.nextBlock;
    if (model.scoresChanged) {
        scoreView.score = model.score;
        scoreView.UpdateScore();
        model.scoresChanged = false;
    }
    playFieldView.repaint();
    nextBlockPreview.repaint();
}