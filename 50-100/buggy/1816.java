@java.lang.Override
public void run() {
    if (urlString.toLowerCase().endsWith(".pdf")) {
        new java.lang.Thread(mRunnableForPDF).start();
    }else {
        java.lang.String appendParams = java.lang.String.format("?user_num=%s&timestamp=%s", userNum, com.intfocus.yonghuitest.util.URLs.timestamp());
        urlString = (urlString.contains("?")) ? urlString.replace("?", appendParams) : java.lang.String.format("%s%s", urlString, appendParams);
        mWebView.loadUrl(urlString);
        android.util.Log.i("OutLink", urlString);
    }
}