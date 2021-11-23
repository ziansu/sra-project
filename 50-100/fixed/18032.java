private static boolean isWithinList(com.purgadell.grizzly.Worlds.DungeonWorld.Board.Helpers.Coordinates c, java.util.LinkedList<com.purgadell.grizzly.Worlds.DungeonWorld.Board.Helpers.Coordinates> list) {
    for (com.purgadell.grizzly.Worlds.DungeonWorld.Board.Helpers.Coordinates q : list) {
        if (((c.coords.row) == (q.coords.row)) && ((c.coords.column) == (q.coords.column))) {
            return true;
        }
    }
    return false;
}