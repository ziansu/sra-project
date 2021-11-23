@java.lang.Override
protected org.json.JSONObject doInBackground(java.lang.String... params) {
    return connector.getDataFromServer(params[0], params[1]);
}