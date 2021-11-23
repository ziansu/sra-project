public void onInitialize() {
    locationService = com.rooksoto.parallel.utility.geolocation.ParallelLocation.getInstance();
    locationService.connect();
    listener.checkLocationServices(locationService);
}