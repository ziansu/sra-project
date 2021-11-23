@java.lang.Override
protected void onPostExecute(java.util.ArrayList<org.json.JSONArray> j) {
    super.onPostExecute(j);
    java.lang.System.out.println(submitUrl);
    if (j != null) {
        for (org.json.JSONArray jsonArray : j) {
            android.util.Log.d("JSON ARRAY", jsonArray.toString());
            doHTTPpost(submitUrl, jsonArray, null);
        }
    }
}