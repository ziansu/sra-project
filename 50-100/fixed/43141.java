public boolean initSmartLockForPasswords() {
    android.support.v4.app.FragmentActivity activity = getActivityAndCheckAvailability();
    if (activity == null) {
        return false;
    }
    mCredentialsClient = new com.google.android.gms.common.api.GoogleApiClient.Builder(activity).addConnectionCallbacks(((com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks) (activity))).enableAutoManage(activity, ((com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener) (activity))).addApi(Auth.CREDENTIALS_API).build();
    return true;
}