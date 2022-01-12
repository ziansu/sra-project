public com.example.dmytro.mapalert.pojo.LocationTime convertCursorItemLocationToLocationTime(com.example.dmytro.mapalert.pojo.CursorLocation cursorLocations) {
    java.lang.String[] time = cursorLocations.getItem().getTime().split(" : ");
    return new com.example.dmytro.mapalert.pojo.LocationTime(cursorLocations.getId(), java.lang.Integer.valueOf(time[0]), java.lang.Integer.valueOf(time[1]), cursorLocations.getItem().getRepeat());
}