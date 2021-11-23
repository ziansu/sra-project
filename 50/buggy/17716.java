@java.lang.Override
protected void onPostExecute(org.json.JSONArray j) {
    super.onPostExecute(j);
    doHTTPpost(Config.SUBMIT_URL, j, null);
}