@java.lang.Override
public void onDataLoaded(java.util.List<org.stepic.droid.model.CertificateViewItem> certificateViewItems) {
    org.stepic.droid.util.ProgressHelper.dismiss(progressBarOnCenter);
    org.stepic.droid.util.ProgressHelper.dismiss(swipeRefreshLayout);
    reportEmpty.setVisibility(View.GONE);
    reportInternetProblem.setVisibility(View.GONE);
    needAuthRootView.setVisibility(View.GONE);
    certificateRecyclerView.setVisibility(View.VISIBLE);
    adapter.updateCertificates(certificateViewItems);
}