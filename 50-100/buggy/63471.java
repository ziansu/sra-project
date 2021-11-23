public org.wordpress.android.ui.posts.adapters.PostsListAdapter getPostListAdapter() {
    if ((mPostsListAdapter) == null) {
        mPostsListAdapter = new org.wordpress.android.ui.posts.adapters.PostsListAdapter(getActivity(), org.wordpress.android.WordPress.getCurrentBlog(), mIsPage);
        mPostsListAdapter.setOnLoadMoreListener(this);
        mPostsListAdapter.setOnPostsLoadedListener(this);
        mPostsListAdapter.setOnPostSelectedListener(this);
        mPostsListAdapter.setOnPostButtonClickListener(this);
    }
    return mPostsListAdapter;
}