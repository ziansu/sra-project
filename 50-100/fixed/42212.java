public boolean geometryCheckSuccess(com.asarg.polysim.PolyTile p, int x, int y) {
    for (com.asarg.polysim.Tile t : p.tiles) {
        if (Grid.containsKey(new java.awt.Point((x + (t.getLocation().x)), (y + (t.getLocation().y))))) {
            return false;
        }
    }
    return true;
}