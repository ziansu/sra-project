public void die(rooms.Thing deadThing) {
    int[] loc = deadThing.getLocation();
    grid[loc[3]][loc[4]] = null;
}