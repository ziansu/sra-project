@java.lang.Override
protected java.lang.Boolean doInBackground(java.lang.Object... objects) {
    android.util.Log.d(com.tenforwardconsulting.cordova.bgloc.LocationUpdateService.TAG, "Executing PostLocationTask#doInBackground");
    com.tenforwardconsulting.cordova.bgloc.data.LocationDAO locationDAO = com.tenforwardconsulting.cordova.bgloc.data.DAOFactory.createLocationDAO(this.getApplicationContext());
    for (android.location.Location savedLocation : locationDAO.getAllLocations()) {
        android.util.Log.d(com.tenforwardconsulting.cordova.bgloc.LocationUpdateService.TAG, "Posting saved location");
        if (postLocation(savedLocation, locationDAO)) {
            locationDAO.deleteLocation(savedLocation);
        }
    }
    return true;
}