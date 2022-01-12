public void moveTailToBackOfHead() {
    if ((length) > 0) {
        com.mygdx.game.Cell tail = body.get(((length) - (length)));
        tail.setX(breadCrumbsList.get(length).getX());
        tail.setY(breadCrumbsList.get(length).getY());
        body.add(length, tail);
    }
}