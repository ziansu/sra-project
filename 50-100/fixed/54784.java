private boolean walkableTile(boolean[][] closedNodes, int x, int y) {
    return ((!(closedNodes[x][y])) == true) && (((metaLayer.getCell(x, y)) == null) || (!(metaLayer.getCell(x, y).getTile().getProperties().equals(this.collision))));
}