private void requestPermission() {
    if (android.support.v4.app.ActivityCompat.shouldShowRequestPermissionRationale(getActivity(), android.Manifest.permission.ACCESS_FINE_LOCATION)) {
        android.widget.Toast.makeText(getActivity().getApplicationContext(), R.string.gpspermiso, Toast.LENGTH_LONG).show();
    }else {
        android.support.v4.app.ActivityCompat.requestPermissions(getActivity(), new java.lang.String[]{ android.Manifest.permission.ACCESS_FINE_LOCATION }, 1);
    }
    return ;
}