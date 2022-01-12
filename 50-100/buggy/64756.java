public boolean selectGame(int newGameType) {
    try {
        if ((newGameType < 1) || (newGameType > 3)) {
            throw new Exception.OutOfGameType();
        }
        if (newGameType != (gameType)) {
            gameType = newGameType;
            presentAthlete = new java.util.ArrayList<java.lang.String>();
            presentOfficial = new java.lang.String();
        }
        return true;
    } catch (java.lang.Exception e) {
        return false;
    }
}