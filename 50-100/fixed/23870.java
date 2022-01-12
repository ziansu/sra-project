private void updateSyncText() {
    java.lang.String syncText = org.wso2.iot.agent.utils.CommonUtils.getTimeAgo(lastSyncMillis, context);
    if (syncText == null) {
        syncText = getResources().getString(R.string.txt_never);
    }
    imageViewRefresh.clearAnimation();
    textViewLastSync.setText(syncText);
    textViewLastSync.invalidate();
}