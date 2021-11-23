@java.lang.Override
protected void onPostExecute(com.example.tahasaber.twsila.PostDataClass postDataClass) {
    posts.add(0, postDataClass);
    mAdapter.notifyItemInserted(0);
    mRecyclerView.smoothScrollToPosition(0);
}