@java.lang.Override
protected void onPostExecute(java.lang.Boolean success) {
    super.onPostExecute(success);
    if (success)
        loadData();
    else {
        android.util.Log.e(tr.xip.wanikani.app.activity.ItemDetailsActivity.TAG, "Failed to fetch item info; exiting...");
        android.widget.Toast.makeText(getApplicationContext(), R.string.error_couldnt_load_data, Toast.LENGTH_SHORT).show();
        finish();
    }
}