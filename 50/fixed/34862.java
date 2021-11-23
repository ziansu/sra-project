private boolean tienePermiso(java.lang.String permissionName) {
    return (android.support.v4.content.ContextCompat.checkSelfPermission(this, permissionName)) == (android.content.pm.PackageManager.PERMISSION_GRANTED);
}