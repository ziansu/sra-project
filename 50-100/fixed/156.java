private main.logic.Location findLocation(java.lang.String locationName) {
    for (main.logic.Location l : locations) {
        if (l.getName().equalsIgnoreCase(locationName)) {
            return l;
        }
    }
    main.logic.Location loc = new main.logic.Location(locationName);
    locations.add(loc);
    loc.attachMonitor(this);
    return loc;
}