@java.lang.Override
public java.lang.String getAccountPassword(android.accounts.Account account) {
    if (!(com.nextgis.maplib.util.PermissionUtil.hasPermission(this, ConstantsUI.PERMISSION_AUTHENTICATE_ACCOUNTS))) {
        return "";
    }
    try {
        return mAccountManager.getPassword(account);
    } catch (java.lang.SecurityException e) {
        e.printStackTrace();
        return "";
    }
}