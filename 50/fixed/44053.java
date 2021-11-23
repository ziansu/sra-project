@java.lang.Override
protected void onPostExecute(com.example.tahasaber.twsila.PostDataClass postDataClass) {
    posts.add(postDataClass);
    mAdapter.notifyItemInserted(((posts.size()) - 1));
}