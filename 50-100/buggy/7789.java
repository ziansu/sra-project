public void moveTailToBackOfHead() {
    if ((length) > 0) {
        com.mygdx.game.Cell tail = body.get(((length) - (length)));
        tail.setX(breadCrumbsList.get(((length) - 1)).getX());
        tail.setY(breadCrumbsList.get(((length) - 1)).getY());
        body.add(((length) - 1), tail);
    }
}