@java.lang.Override
public void downloadInProgress() {
    if ((banner) != null) {
        banner.updateBannerInProgress(false);
    }
    listAdapter.notifyDataSetChanged();
}