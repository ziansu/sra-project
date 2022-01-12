@java.lang.Override
public boolean onLongClick(android.view.View view) {
    showDownloadConfirmDialog(((android.webkit.WebView) (view)));
    return false;
}