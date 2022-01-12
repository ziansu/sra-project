@java.lang.SuppressWarnings(value = "unused")
public void onEventMainThread(org.wordpress.android.util.CoreEvents.BlogListChanged event) {
    if ((!(isAdded())) || ((mBlog) == null)) {
        return ;
    }
    mBlog = org.wordpress.android.WordPress.getBlog(mBlog.getLocalTableBlogId());
    if ((mBlog) == null) {
        return ;
    }
    if (!(mBlogTitleTextView.getText().equals(mBlog.getBlogName()))) {
        mBlogTitleTextView.setText(mBlog.getBlogName());
    }
}