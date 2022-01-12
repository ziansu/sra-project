@java.lang.Override
public void onClick(android.view.View v) {
    net.osmand.plus.firstusage.FirstUsageWizardFragment.secondMapDownloadCancelled = true;
    downloadThread.cancelDownload(item);
    mapDescriptionTextView.setText(item.getSizeDescription(getContext()));
    progressPadding.setVisibility(View.VISIBLE);
    progressLayout.setVisibility(View.GONE);
    redownloadButton.setVisibility(View.VISIBLE);
}