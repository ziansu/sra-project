@java.lang.Override
protected org.json.JSONObject doInBackground(java.lang.String... parameters) {
    org.json.JSONObject json = null;
    if (parameters[2].equals("GET")) {
        json = sendGet(parameters);
    }else
        if (parameters[2].equals("POST")) {
            json = sendPost(parameters);
        }
    
    return json;
}