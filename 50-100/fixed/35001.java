public void findPath() {
    map.Vertex vertex;
    map.Vertex start = new map.Vertex(x, y, InGame.map.getPathFinding());
    vertex = InGame.map.getPathFinding().findPath(start, new map.Vertex(InGame.player.getx(), InGame.player.gety(), InGame.map.getPathFinding()));
}