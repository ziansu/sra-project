public void setAllGames(modeling.GameList allGames) {
    if ((allGames.getGames().size()) != 0) {
        this.allGames = allGames.getGames();
        if ((currGame) != null) {
            setCurrGame(allGames.findGame(currGame.getGameID()));
        }
        setChanged();
        modeling.GameList wrapperGameList = new modeling.GameList();
        wrapperGameList.setGames(this.allGames);
        notifyObservers(wrapperGameList);
    }
}