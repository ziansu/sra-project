private void setLocationParameter() {
    mLocationRequest.setInterval(600000);
    mLocationRequest.setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY);
    mLocationRequest.setSmallestDisplacement(0);
    mLocationRequest.setFastestInterval(60000);
}