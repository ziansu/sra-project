private void doNext(int requestCode, int[] grantResults) {
    if (requestCode == (REQUEST_CODE)) {
        for (int grantResult : grantResults) {
            if (grantResult != (android.content.pm.PackageManager.PERMISSION_GRANTED)) {
                requestOurPermissions();
                return ;
            }
        }
        directStartService();
    }
}