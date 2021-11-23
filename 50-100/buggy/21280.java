@java.lang.Override
public void onResponse(org.json.JSONObject response) {
    org.wordpress.android.util.AppLog.d(AppLog.T.API, "Received response to Settings REST request.");
    credentialsVerified(true);
    mRemoteSettings.localTableId = mBlog.getRemoteBlogId();
    deserializeDotComRestResponse(mBlog, response);
    if (!(mRemoteSettings.equals(mSettings))) {
        final java.util.Map<java.lang.String, java.lang.String> currentPostFormats = mSettings.postFormats;
        final java.lang.String[] currentPostFormatKeys = mSettings.postFormatKeys;
        mSettings.copyFrom(mRemoteSettings);
        mSettings.postFormats = currentPostFormats;
        mSettings.postFormatKeys = currentPostFormatKeys;
        org.wordpress.android.datasets.SiteSettingsTable.saveSettings(mSettings);
        notifyUpdatedOnUiThread(null);
    }
}