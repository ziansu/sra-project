private boolean archivePermissionsGranted(int[] permissionRequestResults) {
    return ((permissionRequestResults.length) > 0) && ((permissionRequestResults[0]) == (android.content.pm.PackageManager.PERMISSION_GRANTED));
}