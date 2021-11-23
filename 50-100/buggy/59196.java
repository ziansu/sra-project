private java.lang.String getTheResult(int roundResult, java.lang.String user) {
    if (roundResult == (model.engine.MultiPlayerGame.LOOSER)) {
        gamersOver.add(user);
        return "L: " + (gamers.get(user));
    }else
        if (roundResult > (sequence.roundsNumber())) {
            return "W: completed";
        }else {
            return (model.engine.MultiPlayerGame.SEQUENCE_ID) + (getSequence(user));
        }
    
}