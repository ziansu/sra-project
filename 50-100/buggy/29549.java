public void updateRooms(java.util.List<org.Point> Rooms) {
    RMOL.clear();
    searchString = SearchField.getText();
    if ((searchString) == "") {
        RMOL.addAll(Rooms);
    }else {
        RMOL.addAll(database.fuzzySearchPoints(searchString));
    }
    RoomDirectory.setItems(RMOL);
}