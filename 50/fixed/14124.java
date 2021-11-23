@java.lang.Override
protected void onPostExecute(com.hotmale.packagefriendfinder.Database.QueryResult value) {
    if ((delegate) != null) {
        delegate.processFinish(value);
    }
}