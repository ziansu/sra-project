private boolean shapeIsComplete(mygames.lineball.Balls.Ball b) {
    return ((ballsTracked.size()) > 1) && (b.equals(ballsTracked.get(0)));
}