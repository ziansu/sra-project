void setupCamera() {
    int permissionCheck = android.support.v4.content.ContextCompat.checkSelfPermission(getActivity(), Manifest.permission.CAMERA);
    if (permissionCheck == (android.content.pm.PackageManager.PERMISSION_GRANTED)) {
        boolean opened = safeCameraOpenInView();
        if (!opened) {
            android.util.Log.d(com.example.m.divis.FragmentCalibrate.TAG, "Error, Camera failed to open");
        }
    }else {
        if (android.support.v4.app.ActivityCompat.shouldShowRequestPermissionRationale(getActivity(), Manifest.permission.CAMERA)) {
        }else {
            android.support.v4.app.ActivityCompat.requestPermissions(getActivity(), new java.lang.String[]{ Manifest.permission.CAMERA }, com.example.m.divis.FragmentCalibrate.MY_PERMISSIONS_REQUEST_CAMERA);
        }
    }
}