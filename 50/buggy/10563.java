public org.json.JSONObject get(java.lang.String link) {
    try {
        return remoteGet.send(link, null);
    } catch (java.lang.Exception e) {
        android.util.Log.i("WEB", e.getMessage());
    }
    return null;
}