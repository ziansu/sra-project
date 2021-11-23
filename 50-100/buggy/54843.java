@java.lang.Override
public boolean onOverrideUrlLoading(java.lang.String var1) {
    if (android.text.TextUtils.isEmpty(var1)) {
        return false;
    }
    if ((this.largThan40) && (var1.startsWith("oneapm"))) {
        this.oneapmWebViewClientApi.shouldOverrideUrlLoading(var1);
    }
    return false;
}