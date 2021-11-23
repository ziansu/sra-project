public java.util.ArrayList<Ozlympic.Game> getGame(boolean getAll) throws Exception.NullResultException {
    if ((gameIDIndex) == (-1))
        throw new Exception.NullResultException();
    
    if (getAll)
        return games;
    else {
        java.util.ArrayList<Ozlympic.Game> lastGame = new java.util.ArrayList<Ozlympic.Game>(1);
        lastGame.add(games.get(gameIDIndex));
        return lastGame;
    }
}