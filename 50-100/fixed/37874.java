public void init(android.content.Context context, net.kazhik.gambarumeter.monitor.SensorValueListener listener) {
    this.context = context;
    this.listener = listener;
    this.googleApiClient = new com.google.android.gms.common.api.GoogleApiClient.Builder(context).addApi(LocationServices.API).addApi(Wearable.API).addConnectionCallbacks(this).addOnConnectionFailedListener(this).build();
    this.googleApiClient.connect();
    android.location.LocationManager locationManager = ((android.location.LocationManager) (getSystemService(Context.LOCATION_SERVICE)));
    locationManager.addGpsStatusListener(this);
}