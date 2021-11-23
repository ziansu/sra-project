private void requestQuestion(User user) throws java.lang.Exception {
    Game game = user.getGame();
    game.requestQuestion();
}