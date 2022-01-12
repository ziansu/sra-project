private void startNewGame() {
    int value = triviagame.control.GameControl.createNewGame(TriviaGame.getPlayer());
    if (value < 0) {
        triviagame.view.ErrorView.display(this.getClass().getName(), "ERROR - Failed to create new game");
    }
    triviagame.view.GameMenuView gameMenu = new triviagame.view.GameMenuView();
    gameMenu.display();
}