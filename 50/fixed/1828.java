private static boolean hasWriteSecureSettingsPermission(android.content.Context context) {
    return ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.M)) && ((context.checkSelfPermission(Manifest.permission.WRITE_SECURE_SETTINGS)) == (android.content.pm.PackageManager.PERMISSION_GRANTED));
}