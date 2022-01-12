@java.lang.SuppressWarnings(value = "deprecation")
@java.lang.Override
public void onReceivedError(android.webkit.WebView view, int errorCode, java.lang.String description, java.lang.String failingUrl) {
    if ((errorCode == (ERROR_HOST_LOOKUP)) || (errorCode == (ERROR_FILE_NOT_FOUND))) {
        captchaListener.onError((("error" + "ERROR_FILE_NOT_FOUND") + errorCode));
    }
    super.onReceivedError(view, errorCode, description, failingUrl);
}