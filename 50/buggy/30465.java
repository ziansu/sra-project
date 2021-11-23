@java.lang.Override
protected void onPostExecute(java.lang.Void result) {
    android.util.Log.d(TAG, "Search results read");
    android.content.Intent intent = new android.content.Intent(getApplicationContext(), com.inhand.inhandappbeta.ResultsActivity.class);
    com.inhand.inhandappbeta.DataHolder.getInstance().setData(url);
    startActivity(intent);
}