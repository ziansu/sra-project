public void setDistances(android.location.Location loc) {
    if (loc != null) {
        for (ch.hsr.cp.traildevils.domain.Trail trail : list) {
            android.location.Location l = new android.location.Location("");
            l.setLongitude(trail.getGmapY());
            l.setLatitude(trail.getGmapX());
            trail.setDistance(loc.distanceTo(l));
        }
        dataChanged();
    }
}