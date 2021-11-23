public void abonnementGPS() {
    if ((((android.support.v4.app.ActivityCompat.checkSelfPermission(this.getActivity(), Manifest.permission.ACCESS_FINE_LOCATION)) != (android.content.pm.PackageManager.PERMISSION_GRANTED)) && ((android.support.v4.app.ActivityCompat.checkSelfPermission(this.getActivity(), Manifest.permission.ACCESS_COARSE_LOCATION)) != (android.content.pm.PackageManager.PERMISSION_GRANTED))) && ((com.m2dl.miniprojetpointinteret.Fragments.MapsFragment.mMap) == null)) {
        return ;
    }
    locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 5000, 10, loc);
}