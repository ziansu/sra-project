@java.lang.Override
protected void onPostExecute(org.json.JSONObject jsonObject) {
    super.onPostExecute(jsonObject);
    if (jsonObject != null) {
        android.content.Intent intent = new android.content.Intent(this, hyperactive.co.il.myfacebookapp.ShareActivity.class);
        intent.putExtra("friendsList", jsonObject.toString());
        startActivity(intent);
    }
}