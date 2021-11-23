@java.lang.Override
public void onClick(android.view.View v) {
    floatingActionsMenu.collapse();
    getActivity().startActivity(shts.jp.android.nogifeed.utils.ShareUtils.getShareBlogIntent(blog));
}