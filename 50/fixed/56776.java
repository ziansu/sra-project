private void openLink() {
    if (!(isPermissionGranted())) {
        android.support.v4.app.ActivityCompat.requestPermissions(getActivity(), new java.lang.String[]{ Manifest.permission.WRITE_EXTERNAL_STORAGE }, ru.dzgeorgy.versioncheck.VersionUpdateDialog.PERMISSION_WRITE_EXTERNAL_STORAGE);
        openLink();
    }else {
        ru.dzgeorgy.versioncheck.VersionUpdateDialog.startDownload();
    }
}