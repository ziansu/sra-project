public boolean checkLocationPermission() {
    boolean isPermissionGranted = false;
    if ((android.support.v4.content.ContextCompat.checkSelfPermission(getContext(), android.Manifest.permission.ACCESS_FINE_LOCATION)) != (android.content.pm.PackageManager.PERMISSION_GRANTED)) {
        android.support.v4.app.ActivityCompat.requestPermissions(getActivity(), new java.lang.String[]{ android.Manifest.permission.ACCESS_FINE_LOCATION }, com.example.android.climbtogether.fragment.HomeFragment.LOCATION_PERMISSION_REQUEST_CODE);
        isPermissionGranted = true;
    }else
        if ((android.support.v4.content.ContextCompat.checkSelfPermission(getContext(), Manifest.permission.ACCESS_FINE_LOCATION)) == (android.content.pm.PackageManager.PERMISSION_GRANTED)) {
            isPermissionGranted = true;
        }
    
    return isPermissionGranted;
}