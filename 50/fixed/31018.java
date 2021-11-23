@java.lang.Override
public int getItemCount() {
    return (allPosts.getList()) != null ? allPosts.getList().size() : 0;
}