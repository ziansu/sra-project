private boolean createMatchRoute() {
    this.matchRoute = new com.gogreen.greenmachine.parseobjects.MatchRoute();
    java.util.ArrayList<com.gogreen.greenmachine.parseobjects.Hotspot> selectedHotspotsList = new java.util.ArrayList<com.gogreen.greenmachine.parseobjects.Hotspot>(selectedHotspots);
    boolean saved = backend.sendRiderRequest(new com.gogreen.greenmachine.parseobjects.MatchRoute[]{ this.matchRoute }, selectedHotspotsList, currentCapacity, driverCar, matchByDate, arriveByDate, destination);
    android.util.Log.i("DrivingHotspotSelect", ("createMatchRoute " + (this.matchRoute.getObjectId())));
    return saved;
}