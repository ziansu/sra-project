public boolean placeBeacon(java.lang.String title, double latCoord, double longCoord, java.util.Date start, java.util.Date end, double range, java.lang.String address, java.util.ArrayList<java.lang.String> tagList) {
    beacon.Beacon newBeacon = Beacon(this.mongoClient, this.db, this.username, title, latCoord, longCoord, start, end, range, address, tagList);
    boolean created = newBeacon.insert();
    return created;
}