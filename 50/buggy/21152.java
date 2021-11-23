@java.lang.Override
public void onClick(android.view.View v) {
    getDownloadButton().setClickable(true);
    getDownloadButton().setText(getString(R.string.download));
    hideDownloadProgressBar();
    cancel(true);
}