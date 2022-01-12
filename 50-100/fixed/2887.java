@java.lang.Override
public void onClick(android.view.View view) {
    timber.log.Timber.i("buttonDownload onClick");
    timber.log.Timber.i((((("Downloading " + (application.getPackageName())) + " (version ") + (applicationVersion.getVersionCode())) + ")..."));
    viewHolder.buttonDownload.setVisibility(View.GONE);
    viewHolder.progressBarDownloadProgress.setVisibility(View.VISIBLE);
    viewHolder.textViewDownloadProgress.setVisibility(View.VISIBLE);
    timber.log.Timber.i(("applicationVersion: " + applicationVersion));
    new ai.elimu.appstore.synchronization.AppListArrayAdapter.DownloadApplicationAsyncTask(viewHolder.progressBarDownloadProgress, viewHolder.textViewDownloadProgress, viewHolder.buttonInstall).execute(applicationVersion);
}