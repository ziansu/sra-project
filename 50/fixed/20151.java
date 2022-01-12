@java.lang.Override
protected void onPostExecute(org.json.JSONObject result) {
    this.progress.dismiss();
    super.onPostExecute(result);
}