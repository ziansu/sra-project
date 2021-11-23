@java.lang.Override
protected void onPostExecute(java.util.ArrayList<com.kevin.jokeji.beans.Joke> result) {
    mJokes = result;
    isRefresh = false;
    mRefreshLayout.setRefreshing(false);
    if ((mJokes) != null) {
        mAdapter.bindData(mJokes);
        mAdapter.notifyDataSetChanged();
    }
}