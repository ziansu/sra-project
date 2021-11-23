public void requestChoices(User user) {
    Game game = user.getGame();
    game.requestChoices();
}