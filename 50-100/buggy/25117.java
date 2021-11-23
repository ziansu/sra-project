@java.lang.Override
protected org.json.JSONArray doInBackground(java.lang.Void... params) {
    java.lang.String version = com.kagami.merusuto.Utils.checkVersion(mContext, ((getTemplateString()) + ".json"), mImmediately);
    if (version != null) {
        publishProgress();
        return com.kagami.merusuto.Utils.updateJSONData(mContext, ((getTemplateString()) + ".json"), version);
    }
    return null;
}