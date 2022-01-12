@java.lang.Override
protected java.lang.Void doInBackground(java.lang.String... strings) {
    java.lang.String downloadResponse = "";
    try {
        downloadResponse = performDownloadPost(new java.util.HashMap<java.lang.String, java.lang.String>() {
            {
                put("Accept", "application/json");
                put("Content-Type", "application/json");
            }
        });
        org.json.JSONArray responseJSON = new org.json.JSONArray(downloadResponse);
        saveToSQLite(responseJSON);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return null;
}