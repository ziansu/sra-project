public java.util.List<models.dir.Location> search(java.lang.String query) {
    query = query.toLowerCase();
    java.util.List<models.dir.Location> locations = new java.util.ArrayList<>();
    for (models.dir.Location loc : getAllLocations()) {
        if ((loc.getName().toLowerCase().contains(query)) || (loc.getNode().getRoomName().toLowerCase().equals(query))) {
            locations.add(loc);
        }
    }
    return locations;
}