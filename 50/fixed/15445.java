@java.lang.Override
protected org.json.JSONObject doInBackground(java.lang.Void... voids) {
    if (!(com.bananaplan.workflowandroid.main.MainApplication.sUseTestData)) {
        if (com.bananaplan.workflowandroid.data.loading.RestfulUtils.isConnectToInternet(mContext)) {
            return mPostRequestStrategy.post();
        }else {
            cancel(true);
        }
    }
    return null;
}