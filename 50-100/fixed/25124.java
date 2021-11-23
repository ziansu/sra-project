public boolean checkForSnake(snakes.game.Snake p1, snakes.game.Snake p2) {
    if ((p2.getBody().contains(p1.getHead())) || (p1.getHead().equals(p2.getHead()))) {
        return true;
    }
    return false;
}