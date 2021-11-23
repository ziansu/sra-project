void updateCommentList() {
    org.wordpress.android.ui.comments.CommentsListFragment listFragment = getListFragment();
    if (listFragment != null) {
        listFragment.updateComments(false);
        listFragment.setRefreshing(true);
    }
}