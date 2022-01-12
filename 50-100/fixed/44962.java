public void updateView() {
    this.levelTextView.setText(((gameModel.level) + ""));
    this.foxesTextView.setText((((gameModel.huntedFoxes) + " / ") + (gameModel.foxes)));
    this.powerTextView.setText(((gameModel.power) + ""));
    this.scoreTextView.setText(((gameModel.score) + ""));
    this.gameAreaView.updateView();
}