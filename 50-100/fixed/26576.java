@java.lang.Override
public void onReceivedHttpError(android.webkit.WebView view, android.webkit.WebResourceRequest request, android.webkit.WebResourceResponse errorResponse) {
    android.util.Log.d(Captcha.TAG, ((request.toString()) + (errorResponse.toString())));
    if ((captchaListener) != null) {
        android.util.Log.d(Captcha.TAG, "onReceivedHttpError ");
    }
    if ((captchaDialog.getProgressDialog()) != null) {
        captchaDialog.getProgressDialog().dismiss();
    }
    super.onReceivedHttpError(view, request, errorResponse);
}