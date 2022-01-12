public void toAdd(android.view.View b) {
    android.location.Location myLoc = locationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER);
    latitude = myLoc.getLatitude();
    longitude = myLoc.getLongitude();
    org.becausewater.dropin.HomeActivity.ft = org.becausewater.dropin.HomeActivity.fm.beginTransaction();
    org.becausewater.dropin.HomeActivity.Add_Fragment af = new org.becausewater.dropin.HomeActivity.Add_Fragment(latitude, longitude);
    org.becausewater.dropin.HomeActivity.ft.add(R.id.container, af).addToBackStack("af").commit();
}