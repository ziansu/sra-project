private void updateSyncText() {
    if (((lastSyncMillis) <= 0) && (org.wso2.iot.agent.utils.Preference.hasPreferenceKey(context, Constants.PreferenceFlag.LAST_SERVER_CALL))) {
        lastSyncMillis = org.wso2.iot.agent.utils.Preference.getLong(context, Constants.PreferenceFlag.LAST_SERVER_CALL);
    }
    java.lang.String syncText = org.wso2.iot.agent.utils.CommonUtils.getTimeAgo(lastSyncMillis, context);
    if (syncText == null) {
        syncText = getResources().getString(R.string.txt_never);
    }
    imageViewRefresh.clearAnimation();
    textViewLastSync.setText(syncText);
    textViewLastSync.invalidate();
}