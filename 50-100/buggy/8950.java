private void localServicePermissionHandler(int[] grantResults) {
    if ((grantResults.length) == 0) {
        return ;
    }
    for (int i : grantResults) {
        if ((grantResults[i]) == (android.content.pm.PackageManager.PERMISSION_DENIED)) {
            return ;
        }
    }
    checkPermissionToLocalService();
}