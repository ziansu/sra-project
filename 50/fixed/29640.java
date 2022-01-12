public void onInitialize() {
    locationService.connect();
    listener.checkLocationServices(locationService);
}