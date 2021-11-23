@org.chromium.base.annotations.CalledByNative
public boolean isMasterSyncEnabled() {
    org.chromium.base.ThreadUtils.assertOnUiThread();
    if ((mMasterSyncEnabledProvider) == null)
        return true;
    
    return mMasterSyncEnabledProvider.isMasterSyncEnabled();
}