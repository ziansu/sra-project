@java.lang.Override
protected java.lang.Void doInBackground(java.lang.String... strings) {
    java.lang.String downloadResponse = "";
    try {
        android.util.Log.i("background", "do in background");
        downloadResponse = performDownloadPost(new java.util.HashMap<java.lang.String, java.lang.String>() {
            {
                put("Accept", "application/json");
                put("Content-Type", "application/json");
            }
        });
        android.util.Log.i("HTTP result", downloadResponse);
        org.json.JSONArray responseJSON = new org.json.JSONArray(downloadResponse);
        saveToSQLite(responseJSON);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return null;
}