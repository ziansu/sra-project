@java.lang.Override
protected void onPostExecute(com.elementum.yelp.search.utils.Response result) {
    requestInProgress = false;
    if ((isFinishing()) || (isCancelled())) {
        return ;
    }
    if (result == null) {
        android.widget.Toast.makeText(getApplicationContext(), R.string.search_error, Toast.LENGTH_LONG).show();
        setLoading(false);
    }else {
        setResult(result);
        onResponse();
    }
}