public void addItem(com.mygdx.game.Item.Type type) {
    items.add(new com.mygdx.game.Item(type));
    if ((items.size()) > 1) {
        java.lang.System.out.println(((items.size()) + " items on the tile."));
    }
}