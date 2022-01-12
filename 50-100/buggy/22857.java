private void populateData(boolean doAnimate, java.lang.String... args) {
    if ((data) != null) {
        data.clear();
        mAdapter.notifyDataSetChanged();
    }
    new com.benrcarvergmail.cvhsmobileapplication.AnnouncementsFragment.DownloadAnnouncements().execute(defaultSpreadsheetUrl);
    if (doAnimate) {
        mAnimatedRecyclerView.setDoAnimate(true);
    }else {
        mAnimatedRecyclerView.setDoAnimate(false);
    }
}