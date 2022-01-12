private void loadCurrentData() {
    nextCommentIndex = 0;
    android.os.Bundle args = new android.os.Bundle();
    args.putString("accountName", statsActivity.getAccountName());
    args.putString("developerId", statsActivity.getDeveloperId());
    args.putString("packageName", statsActivity.getPackage());
    args.putInt("nextCommentIndex", nextCommentIndex);
    statsActivity.refreshStarted();
    disableFooter();
    getLoaderManager().initLoader(com.github.andlyticsproject.CommentsFragment.DB_LOADER_ID, args, this);
}