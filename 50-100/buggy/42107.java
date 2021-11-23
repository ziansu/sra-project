public int startActivity(android.content.Intent intent, int userId) {
    if (userId == (-1)) {
        return com.lody.virtual.helper.compat.ActivityManagerCompat.START_NOT_CURRENT_USER_ACTIVITY;
    }
    android.content.pm.ActivityInfo info = com.lody.virtual.client.core.VirtualCore.get().resolveActivityInfo(intent, userId);
    if (info == null) {
        return com.lody.virtual.helper.compat.ActivityManagerCompat.START_INTENT_NOT_RESOLVED;
    }
    return startActivity(intent, info, null, null, userId);
}