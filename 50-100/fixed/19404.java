public void addRatData(int key, java.lang.String createdDateTime, java.lang.String locationType, int incidentZip, java.lang.String incidentAddress, java.lang.String city, java.lang.String borough, double latitude, double longitude) {
    addRatData(new edu.gatech.cs2340.thericks.models.RatData(key, createdDateTime, locationType, incidentZip, incidentAddress, city, borough, latitude, longitude));
}