public void updateView() {
    levelTextView.setText(((gameModel.level) + ""));
    foxesTextView.setText((((gameModel.huntedFoxes) + " / ") + (gameModel.foxes)));
    powerTextView.setText(((gameModel.power) + ""));
    scoreTextView.setText(((gameModel.score) + ""));
    gameAreaView.updateView(gameModel.getGameAreaFields());
}