@java.lang.Override
protected void onPostExecute(org.onelibrary.data.MessageItem result) {
    if (result != null) {
        android.util.Log.i(org.onelibrary.DetailActivity.LOG_TAG, ("AsyncTask result: " + (result.toString())));
        renderDetail(result);
        manager = new org.onelibrary.data.MessageDataManager(mDbAdapter);
        result.setStatus(1);
        manager.updateMessage(result);
    }
}