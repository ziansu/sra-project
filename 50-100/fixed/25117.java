@java.lang.Override
protected org.json.JSONArray doInBackground(java.lang.Void... params) {
    java.lang.String filename = (getTemplateString()) + ".json";
    java.lang.String version = com.kagami.merusuto.Utils.checkVersion(mContext, filename, mImmediately);
    if (version != null) {
        publishProgress();
        return com.kagami.merusuto.Utils.updateJSONData(mContext, filename, version);
    }
    return null;
}