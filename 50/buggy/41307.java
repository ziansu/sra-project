public void showPermissionGranted(java.lang.String permission) {
    timber.log.Timber.d(((getTypeFromPermission(permission)) + " permission granted"));
    if (com.sravan.and.beintouch.utility.Utilities.checkPermission(this)) {
        getLoaderManager().initLoader(com.sravan.and.beintouch.ui.MainActivity.CALL_LOG_LOADER, null, this);
    }
}