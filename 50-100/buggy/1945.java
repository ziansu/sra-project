@java.lang.Override
void beforeDialogCreated(android.support.v7.app.AlertDialog.Builder builder) {
    super.beforeDialogCreated(builder);
    android.util.Pair<java.lang.String, java.lang.String> titleMessage = com.mapswithme.maps.routing.ResultCodesHelper.getDialogTitleSubtitle(mResultCode, mMissingMaps.size());
    builder.setTitle(titleMessage.first);
    mMessage = titleMessage.second;
    if (com.mapswithme.maps.routing.ResultCodesHelper.isDownloadable(mResultCode))
        builder.setPositiveButton(R.string.download, null);
    
}