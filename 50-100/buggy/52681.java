public void tick() {
    java.util.Iterator<actors.Actor> actIter = actors.iterator();
    while (actIter.hasNext()) {
        actors.Actor a = actIter.next();
        a.tick();
        if (!(a.isAlive())) {
            killActor(a);
            actIter.remove();
        }
    } 
    for (tiles.Tile tile : tiles) {
        tile.tick();
    }
}