void updateCommentList() {
    org.wordpress.android.ui.comments.CommentsListFragment listFragment = getListFragment();
    if (listFragment != null) {
        listFragment.setRefreshing(true);
        listFragment.updateComments(false);
    }
}