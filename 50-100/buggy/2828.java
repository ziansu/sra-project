public static void processDoors2(jaredbgreat.dldungeons.planner.Dungeon dungeon, jaredbgreat.dldungeons.rooms.Room room) {
    room.topDoors = jaredbgreat.dldungeons.planner.astar.DoorChecker.makeConnectionList(room, dungeon.random);
    for (jaredbgreat.dldungeons.pieces.Doorway exit : room.topDoors) {
        exit.priority = -16;
        dungeon.rooms.get(jaredbgreat.dldungeons.planner.astar.DoorChecker.getOtherRoom(exit, room, dungeon)).addToConnections(exit);
    }
}