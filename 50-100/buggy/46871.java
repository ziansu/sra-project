@java.lang.Override
protected void onPostExecute(com.elementum.yelp.search.utils.Response result) {
    if ((isFinishing()) || (isCancelled())) {
        requestInProgress = false;
        return ;
    }
    if (result == null) {
        android.widget.Toast.makeText(getApplicationContext(), R.string.search_error, Toast.LENGTH_LONG).show();
        setLoading(false);
    }else {
        requestInProgress = false;
        setResult(result);
        onResponse();
    }
}