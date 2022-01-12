@java.lang.Override
public void removeTile(java.util.List<qwirkle.Tile> tiles) {
    java.util.List<qwirkle.Tile> temp = new java.util.ArrayList<qwirkle.Tile>();
    for (qwirkle.Tile tile : tiles) {
        for (int i = 0; i < 6; i++) {
            if (getHand().get(i).equals(tile)) {
                temp.add(getHand().get(i));
                break;
            }
        }
    }
    getHand().removeAll(temp);
}