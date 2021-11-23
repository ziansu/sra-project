public void onSuccess(int statusCode, cz.msebera.android.httpclient.Header[] headers, org.json.JSONObject response) {
    android.widget.Toast.makeText(context, (("Success, " + response) + " has been removed from your list"), Toast.LENGTH_LONG).show();
    Refresh();
}