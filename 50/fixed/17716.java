@java.lang.Override
protected void onPostExecute(org.json.JSONArray j) {
    super.onPostExecute(j);
    java.lang.System.out.println(Config.SUBMIT_URL);
    doHTTPpost(Config.SUBMIT_URL, j, null);
}