public boolean verifyPermissions(int[] grantResults) {
    if ((grantResults.length) < 1) {
        return false;
    }
    for (int result : grantResults) {
        if (result != (android.content.pm.PackageManager.PERMISSION_GRANTED)) {
            return false;
        }
    }
    return true;
}