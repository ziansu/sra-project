@java.lang.Override
public boolean onFetchFirstPage(org.wordpress.android.models.PeopleListFilter filter) {
    org.wordpress.android.models.Blog blog = org.wordpress.android.WordPress.getCurrentBlog();
    if ((filter == (org.wordpress.android.models.PeopleListFilter.TEAM)) && (mCanRefreshUsers)) {
        return fetchUsersList(blog.getDotComBlogId(), blog.getLocalTableBlogId(), 0);
    }else
        if ((filter == (org.wordpress.android.models.PeopleListFilter.FOLLOWERS)) && (mCanRefreshFollowers)) {
            return fetchFollowersList(blog.getDotComBlogId(), blog.getLocalTableBlogId(), 1);
        }
    
    return false;
}