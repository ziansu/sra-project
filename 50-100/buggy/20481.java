public void createScoutStop() {
    stop = new vsd.co.za.sambugapp.DomainModels.ScoutStop();
    stop.setDate(new java.util.Date());
    stop.setLastModifiedID(1);
    stop.setTMStamp(new java.util.Date());
    stop.setLatitude(((float) (myLocation.getLatitude())));
    stop.setLongitude(((float) (myLocation.getLongitude())));
}