public void addUser(java.lang.String gamename, User user) {
    Game game = gameList.get(gamename);
    game.addUser(user);
    user.setGame(game);
    clientList.add(user);
}