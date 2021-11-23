@java.lang.Override
public boolean onFetchFirstPage(org.wordpress.android.models.PeopleListFilter filter) {
    org.wordpress.android.models.Blog blog = org.wordpress.android.WordPress.getCurrentBlog();
    if ((filter == (org.wordpress.android.models.PeopleListFilter.TEAM)) && (mCanRefreshUsers)) {
        fetchUsersList(blog.getDotComBlogId(), blog.getLocalTableBlogId(), 0);
        return true;
    }else
        if ((filter == (org.wordpress.android.models.PeopleListFilter.FOLLOWERS)) && (mCanRefreshFollowers)) {
            fetchFollowersList(blog.getDotComBlogId(), blog.getLocalTableBlogId(), 1);
            return true;
        }
    
    return false;
}