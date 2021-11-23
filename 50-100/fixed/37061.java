public void startNavigation(com.mapbox.services.api.directions.v5.models.DirectionsRoute route) {
    this.route = route;
    if (!(isServiceAvailable())) {
        timber.log.Timber.d("MapboxNavigation startNavigation called.");
        if (!(isBound)) {
            context.bindService(getServiceIntent(), connection, 0);
            isBound = true;
        }
        context.startService(getServiceIntent());
    }
}