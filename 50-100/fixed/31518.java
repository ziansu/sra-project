private void handleBlogRemoved() {
    if (!(org.wordpress.android.models.AccountHelper.isSignedIn())) {
        org.wordpress.android.ui.ActivityLauncher.showSignInForResult(this, true);
    }else {
        org.wordpress.android.models.Blog blog = org.wordpress.android.WordPress.getCurrentBlog();
        org.wordpress.android.ui.main.MySiteFragment mySiteFragment = getMySiteFragment();
        if (mySiteFragment != null) {
            mySiteFragment.setBlog(blog);
        }
        if (blog != null) {
            int blogId = blog.getLocalTableBlogId();
            org.wordpress.android.ui.ActivityLauncher.showSitePickerForResult(this, blogId);
        }
    }
}