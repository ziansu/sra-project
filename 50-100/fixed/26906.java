@java.lang.Override
public void onReceivedSslError(android.webkit.WebView view, android.webkit.SslErrorHandler handler, android.net.http.SslError error) {
    if ((captchaListener) != null) {
        android.util.Log.d(Captcha.TAG, "onReceivedHttpError ");
    }
    if ((captchaDialog.getProgressDialog()) != null) {
        captchaDialog.getProgressDialog().dismiss();
    }
    handler.proceed();
}