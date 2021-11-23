private com.dreamteam.villageTycoon.utils.PathFinder.Node getNode(int x, int y) {
    if ((((x < 0) || (x >= (map.length))) || (y < 0)) || (y >= (map[x].length)))
        return null;
    
    if ((nodes[x][y]) == null)
        nodes[x][y] = new com.dreamteam.villageTycoon.utils.PathFinder.Node(new com.dreamteam.villageTycoon.framework.Point(x, y));
    
    return nodes[x][y];
}