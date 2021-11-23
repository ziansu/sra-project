@java.lang.Override
protected void onPostExecute(java.util.ArrayList<com.kevin.jokeji.beans.Joke> result) {
    isRefresh = false;
    mRefreshLayout.setRefreshing(false);
    if (result != null) {
        mJokes = result;
        mAdapter.bindData(mJokes);
        mAdapter.notifyDataSetChanged();
    }
}