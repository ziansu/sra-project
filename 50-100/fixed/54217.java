public boolean isStoragePermissionGranted() {
    if ((Build.VERSION.SDK_INT) >= 23) {
        if ((android.support.v4.content.ContextCompat.checkSelfPermission(getActivity(), android.Manifest.permission.WRITE_EXTERNAL_STORAGE)) == (android.content.pm.PackageManager.PERMISSION_GRANTED)) {
            return true;
        }else {
            requestPermissions(new java.lang.String[]{ Manifest.permission.WRITE_EXTERNAL_STORAGE }, 1);
            return false;
        }
    }else {
        return true;
    }
}