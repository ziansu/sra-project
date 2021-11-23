public void findPath() {
    map.Vertex vertex;
    vertex = InGame.map.getPathFinding().findPath(new map.Vertex(x, y, InGame.map.getPathFinding()), new map.Vertex(InGame.player.getx(), InGame.player.gety(), InGame.map.getPathFinding()));
}