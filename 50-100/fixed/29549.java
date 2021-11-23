public void updateRooms(java.util.List<org.Point> Rooms) {
    RMOL.clear();
    if (searchString.equals("")) {
        RMOL.addAll(Rooms);
    }else {
        RMOL.addAll(database.fuzzySearchPoints(searchString));
    }
    RoomDirectory.setItems(RMOL);
}