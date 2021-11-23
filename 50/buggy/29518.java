@java.lang.Override
protected void onPostExecute(java.security.KeyStore keyStore) {
    if ((mActivity) instanceof com.smarthome.ui.activity.SecureMainActivity) {
        ((com.smarthome.ui.activity.SecureMainActivity) (mActivity)).connectIotManager();
    }
}