private void loadIssueArticles(int position) {
    mLoadIssueId = mCovers.get(position).getId();
    if ((android.text.TextUtils.isEmpty(mLoadIssueId)) || ((mLoadIssueId) != (mCurrentIssueId))) {
        mSubItemsCount = mCovers.get(position).getSubItemsCount();
        mCurrentIssueId = mLoadIssueId;
        InformSnackbar(R.string.loading_articles, true);
        loadArticles();
    }
}