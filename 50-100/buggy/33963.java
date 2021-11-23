@android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.M)
@java.lang.Override
public void onReceivedError(android.webkit.WebView view, android.webkit.WebResourceRequest req, android.webkit.WebResourceError rerr) {
    captchaListener.onError(((req.toString()) + (rerr.toString())));
    if ((captchaDialog.getProgressDialog()) != null) {
        captchaDialog.getProgressDialog().dismiss();
    }
    captchaDialog.show();
    super.onReceivedError(view, req, rerr);
}