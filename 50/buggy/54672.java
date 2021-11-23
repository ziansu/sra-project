public void addChoice(User user, int choice) {
    Game game = user.getGame();
    game.addChoice(user, (choice - 1));
}