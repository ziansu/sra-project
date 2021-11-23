@java.lang.Override
public void onClick(android.view.View v) {
    if ((!(downloadThread.isDownloading(item))) && (!(item.isDownloaded()))) {
        validationManager.startDownload(getActivity(), item);
        net.osmand.plus.firstusage.FirstUsageWizardFragment.firstMapDownloadCancelled = false;
    }
}