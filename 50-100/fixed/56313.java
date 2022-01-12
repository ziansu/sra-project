@java.lang.Override
public void addParams(com.likebamboo.osa.android.request.RequestParams params) {
    if (!(android.text.TextUtils.isEmpty(mSearchKey))) {
        java.lang.String key = mSearchKey;
        try {
            key = java.net.URLEncoder.encode(mSearchKey, "UTF-8");
        } catch (java.lang.Exception e) {
        }
        params.add("key", key);
    }
}