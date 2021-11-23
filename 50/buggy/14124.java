@java.lang.Override
protected void onPostExecute(com.hotmale.packagefriendfinder.Database.QueryResult value) {
    delegate.processFinish(value);
}