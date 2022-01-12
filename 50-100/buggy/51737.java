private static java.util.LinkedList<com.purgadell.grizzly.Worlds.DungeonWorld.Board.Helpers.Coordinates> calcPath(com.purgadell.grizzly.Worlds.DungeonWorld.Board.Helpers.PathFinder.Node end) {
    java.util.LinkedList<com.purgadell.grizzly.Worlds.DungeonWorld.Board.Helpers.Coordinates> path = new java.util.LinkedList<com.purgadell.grizzly.Worlds.DungeonWorld.Board.Helpers.Coordinates>();
    while ((end.parent_Node) != null) {
        path.push(end.cords);
        end = end.parent_Node;
    } 
    return path;
}