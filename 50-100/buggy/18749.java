public Uri.Builder getDirUriBuilder(java.lang.String tableName, boolean syncToNetwork, boolean undeleting) {
    final android.net.Uri.Builder builder = getDirUriBuilder(tableName);
    if (undeleting)
        builder.appendQueryParameter(pl.selvin.android.syncframework.content.ContentHelper.PARAMETER_UNDELETING, java.lang.Boolean.toString(true));
    
    if (syncToNetwork)
        builder.appendQueryParameter(pl.selvin.android.syncframework.content.ContentHelper.PARAMETER_SYNC_TO_NETWORK, java.lang.Boolean.toString(true));
    
    return builder;
}