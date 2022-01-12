public static int onGetCallingUid(int originUid) {
    if (false) {
        int callingPid = android.os.Binder.getCallingPid();
        int vuid = com.lody.virtual.client.local.VActivityManager.get().getUidByPid(callingPid);
        if (vuid != (-1)) {
            return com.lody.virtual.os.VUserHandle.getAppId(vuid);
        }
    }
    return com.lody.virtual.client.VClientImpl.getClient().getBaseVUid();
}