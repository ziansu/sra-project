@java.lang.Override
public void onComplete(java.lang.String response) {
    super.onComplete(response);
    if (!(android.text.TextUtils.isEmpty(response))) {
        if (response.startsWith("{\"statuses\"")) {
            mStatusList = com.sina.weibo.sdk.openapi.models.StatusList.parse(response);
            if (null != (mStatusList.statusList)) {
                setViewData(mStatusList.statusList);
            }else {
                android.util.Log.d(com.bricechou.weiboclient.fragment.HomeFragment.TAG, "Refresh onComplete: No Result.");
                refreshViewDone();
            }
        }
    }
}