public void requestPermission(io.dcloud.common.DHInterface.IWebview webview, org.json.JSONArray data) {
    int currentVersion = android.os.Build.VERSION.SDK_INT;
    if (currentVersion > (android.os.Build.VERSION_CODES.LOLLIPOP)) {
        cn.jpush.android.api.JPushInterface.requestPermission(webview.getContext());
    }
}