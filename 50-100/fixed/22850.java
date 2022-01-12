@java.lang.Override
protected void onPostExecute(android.net.Uri result) {
    super.onPostExecute(result);
    if ((result != null) && (!(android.text.TextUtils.isEmpty(result.toString())))) {
        new vandy.mooc.DownloadImageActivity.FilterImageTask().execute(result);
    }else {
        android.content.Intent intent = getIntent();
        setResult(vandy.mooc.RESULT_CANCELED, intent);
        finish();
    }
}