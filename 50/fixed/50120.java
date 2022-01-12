@java.lang.Override
public void onClick(android.view.View v) {
    if ((mBlog) != null) {
        org.wordpress.android.ui.ActivityLauncher.viewBlogStats(getActivity(), mBlog.getLocalTableBlogId());
    }
}