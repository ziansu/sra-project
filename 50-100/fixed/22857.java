private boolean populateData(boolean doAnimate) {
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
    return false;
}