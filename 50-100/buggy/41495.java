private void verifyPermissions() {
    java.util.List<java.lang.String> requestedPermissions = new java.util.ArrayList<>();
    for (java.lang.String permission : com.example.meelis.virtualdrivinginstructor.MainActivity.mPermissions) {
        if ((android.support.v4.app.ActivityCompat.checkSelfPermission(this, permission)) != (android.content.pm.PackageManager.PERMISSION_GRANTED)) {
            requestedPermissions.add(permission);
        }
    }
    android.support.v4.app.ActivityCompat.requestPermissions(this, requestedPermissions.toArray(new java.lang.String[requestedPermissions.size()]), 1);
}