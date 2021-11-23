public static void viewBlogStats(android.content.Context context, int blogLocalTableId) {
    if (blogLocalTableId == 0)
        return ;
    
    android.content.Intent intent = new android.content.Intent(context, org.wordpress.android.ui.stats.StatsActivity.class);
    intent.putExtra(StatsActivity.ARG_LOCAL_TABLE_BLOG_ID, blogLocalTableId);
    context.startActivity(intent);
}