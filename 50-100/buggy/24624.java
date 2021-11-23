@java.lang.Override
public void onClick(android.view.View v) {
    if (((!(downloadThread.isDownloading(item))) && (!(item.isDownloaded()))) && (net.osmand.plus.firstusage.FirstUsageWizardFragment.firstMapDownloadCancelled)) {
        progressPadding.setVisibility(View.GONE);
        progressLayout.setVisibility(View.VISIBLE);
        redownloadButton.setVisibility(View.GONE);
        validationManager.startDownload(getActivity(), item);
        net.osmand.plus.firstusage.FirstUsageWizardFragment.firstMapDownloadCancelled = false;
    }
}