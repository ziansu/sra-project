@java.lang.Override
protected void onPostExecute(java.lang.Integer result) {
    if (result == (SUCCESS)) {
        adapter.notifyDataSetChanged();
        showProgress(false);
        mFetchItemsTask = null;
    }else
        if (result == (NO_ITEMS)) {
            showProgress(false);
            mFetchItemsTask = null;
        }else
            if (result == (OTHER_FAILURE)) {
                android.util.Log.e(LOG_TAG, "It appears that the task failed :(");
                showProgress(false);
                mFetchItemsTask = null;
            }
        
    
}