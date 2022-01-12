public static boolean hasPermission(@android.support.annotation.NonNull
android.content.Context context, @android.support.annotation.NonNull
java.lang.String... permissions) {
    for (java.lang.String per : permissions) {
        int result = android.support.v4.content.PermissionChecker.checkSelfPermission(context, per);
        if (result != (android.support.v4.content.PermissionChecker.PERMISSION_GRANTED)) {
            return false;
        }
    }
    return true;
}