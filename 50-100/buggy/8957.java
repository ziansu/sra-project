@java.lang.Override
public void run() {
    if (((mDownloadProgressDialog) != null) && (mDownloadProgressDialog.isShowing())) {
        mDownloadProgressDialog.dismiss();
        mDownloadProgressDialog = null;
    }
    if (!(task.isCanceled())) {
        if (task instanceof com.door43.translationstudio.tasks.GetLibraryUpdatesTask) {
        }else {
            new android.app.AlertDialog.Builder(this).setTitle(R.string.success).setIcon(R.drawable.ic_done_black_24dp).setMessage(R.string.download_complete).setCancelable(false).setPositiveButton(R.string.label_ok, null).show();
        }
    }
}