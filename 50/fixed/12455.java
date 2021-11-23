private void playGame() {
    java.lang.String chosen = chooseGame();
    if (isSelected(chosen)) {
        new player.menu.MainMenu(new player.Loader(chosen, null), polyglot, IOResources);
    }
}