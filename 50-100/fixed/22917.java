@android.support.annotation.NonNull
public static org.json.JSONArray toJsonArray(@android.support.annotation.NonNull
java.lang.Iterable<?> objects) {
    net.openid.appauth.Preconditions.checkNotNull(objects, "objects cannot be null");
    org.json.JSONArray jsonArray = new org.json.JSONArray();
    for (java.lang.Object obj : objects) {
        java.lang.String s;
        if ((obj != null) && (!(android.text.TextUtils.isEmpty((s = obj.toString().trim()))))) {
            jsonArray.put(s);
        }
    }
    return jsonArray;
}