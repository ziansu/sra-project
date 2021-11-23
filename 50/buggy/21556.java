public void spawnItem(float x, float y) {
    io.piotrjastrzebski.playground.cellularautomata.Transport4Test.Item item = new io.piotrjastrzebski.playground.cellularautomata.Transport4Test.Item(x, y);
    items.add(item);
    addItem(item);
}