public boolean addGame(modeling.Game newGame) {
    if ((newGame != null) && (!(games.contains(newGame)))) {
        games.add(newGame);
        return true;
    }
    return false;
}