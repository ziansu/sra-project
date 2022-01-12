public void setStone(goGame.Index i, java.lang.String status) {
    goGame.Board.Status nowPlaying = (status.equals("black")) ? goGame.Board.Status.BLACK : goGame.Board.Status.WHITE;
    boolean white = (nowPlaying.equals(goGame.Board.Status.WHITE)) ? true : false;
    stones.put(i, nowPlaying);
    GUI.addStone(i.getX(), i.getY(), white);
    changeBoardAfterMove(i, status);
    savePositions();
}