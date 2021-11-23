@java.lang.Override
public boolean shouldShowRequestPermissionRationale(@android.support.annotation.NonNull
java.lang.String permission) {
    return (Manifest.permission.GET_ACCOUNTS.equals(permission)) && (new de.iweinzierl.worktrack.util.SettingsHelper(this).askAgainForGetAccountsPermission());
}