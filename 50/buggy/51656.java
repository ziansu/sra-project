protected void createLocationRequest() {
    mLocationRequest = new com.google.android.gms.location.LocationRequest();
    mLocationRequest.setInterval(5000);
    mLocationRequest.setFastestInterval(2000);
    mLocationRequest.setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY);
    java.lang.System.out.println("***End of createLocationRequest reached");
}