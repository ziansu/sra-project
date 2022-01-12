private static java.util.LinkedList<com.purgadell.grizzly.Worlds.DungeonWorld.Board.Helpers.Coordinates> calcPath(com.purgadell.grizzly.Worlds.DungeonWorld.Board.Helpers.PathFinder.Node end) {
    java.util.LinkedList<com.purgadell.grizzly.Worlds.DungeonWorld.Board.Helpers.Coordinates> path = new java.util.LinkedList<com.purgadell.grizzly.Worlds.DungeonWorld.Board.Helpers.Coordinates>();
    do {
        path.push(end.cords);
        end = end.parent_Node;
    } while ((end.parent_Node) != null );
    return path;
}