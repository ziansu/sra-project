public android.content.Intent startActivity(android.content.Intent intent, int userId) {
    if (userId == (-1)) {
        return null;
    }
    android.content.pm.ActivityInfo info = com.lody.virtual.client.core.VirtualCore.get().resolveActivityInfo(intent, userId);
    if (info == null) {
        return null;
    }
    return startActivity(intent, info, null, null, userId);
}