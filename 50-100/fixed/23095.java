private static void addNamePath(java.util.ArrayList<java.lang.String> names, org.mycontroller.standalone.db.tables.Room room) {
    names.add(room.getName());
    if ((room.getParentId()) != null) {
        room = org.mycontroller.standalone.db.DaoUtils.getRoomDao().getById(room.getParentId());
        if (room != null) {
            org.mycontroller.standalone.db.RoomUtils.addNamePath(names, room);
        }
    }
}