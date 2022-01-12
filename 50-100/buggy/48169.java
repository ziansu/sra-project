@java.lang.Override
public void onClick(android.view.View v) {
    downloadThread.cancelDownload(item);
    net.osmand.plus.firstusage.FirstUsageWizardFragment.secondMapDownloadCancelled = true;
    mapDescriptionTextView.setText(item.getSizeDescription(getContext()));
    progressPadding.setVisibility(View.VISIBLE);
    progressLayout.setVisibility(View.GONE);
    redownloadButton.setVisibility(View.VISIBLE);
}