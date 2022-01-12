@java.lang.Override
protected void onPostExecute(java.lang.String result) {
    super.onPostExecute(result);
    if (!(error)) {
        org.json.JSONArray data = null;
        try {
            data = new org.json.JSONArray(result);
        } catch (org.json.JSONException e) {
            e.printStackTrace();
        }
        callback.onLoadComplete(data);
    }else {
        callback.onError(errorCode, txtError);
    }
}