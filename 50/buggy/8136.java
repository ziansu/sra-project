public java.lang.String computerMove(org.traxgame.main.Traxboard tb) {
    try {
        return org.traxgame.main.TraxUtil.getRandomMove(tb);
    } catch (org.traxgame.main.IllegalMoveException e) {
        e.printStackTrace();
        throw new java.lang.RuntimeException();
    }
}