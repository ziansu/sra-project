public void tick() {
    java.util.Iterator<actors.Actor> actIter = actors.iterator();
    for (actors.Actor a : actors) {
        a.tick();
        if (!(a.isAlive())) {
            killActor(a);
            actors.remove(a);
        }
    }
    for (tiles.Tile tile : tiles) {
        tile.tick();
    }
}