@java.lang.Override
protected java.lang.String doInBackground(java.lang.String... params) {
    org.apache.http.client.methods.HttpPost httppost = new org.apache.http.client.methods.HttpPost(mURL);
    try {
        org.apache.http.HttpResponse response = httpclient.execute(httppost);
        jsonResult = inputStreamToString(response.getEntity().getContent()).toString();
    } catch (java.io.IOException e) {
        e.printStackTrace();
        error = true;
    }
    return null;
}