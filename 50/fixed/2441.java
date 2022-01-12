@java.lang.Override
public void onClick(android.view.View v) {
    floatingActionsMenu.collapse();
    startActivity(shts.jp.android.nogifeed.utils.ShareUtils.getShareBlogIntent(blog));
}