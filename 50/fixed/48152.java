@java.lang.Override
protected void onResume() {
    super.onResume();
    mLocation = getLocation(LocationServices.FusedLocationApi, true);
}