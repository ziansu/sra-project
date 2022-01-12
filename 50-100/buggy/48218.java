private void getRWPermission() {
    boolean hasPermission = (android.support.v4.content.ContextCompat.checkSelfPermission(this.getContext(), Manifest.permission.INTERNET)) == (android.content.pm.PackageManager.PERMISSION_GRANTED);
    if (!hasPermission) {
        android.support.v4.app.ActivityCompat.requestPermissions(this.getActivity(), new java.lang.String[]{ Manifest.permission.READ_EXTERNAL_STORAGE , Manifest.permission.WRITE_EXTERNAL_STORAGE }, sxccal.edu.android.remouse.SensorFragment.REQUEST_RW_PERMISSION);
    }
}