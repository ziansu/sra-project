public boolean addGame(modeling.Game newGame) {
    if (newGame != null) {
        games.add(newGame);
        return true;
    }
    return false;
}