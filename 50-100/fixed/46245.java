private void ProcessJavascript(java.lang.String js, java.lang.String callbackFunction) {
    if ((Build.VERSION.SDK_INT) > 19) {
        this.evaluateJavascript((("(function(){" + js) + "})()"), new android.webkit.ValueCallback<java.lang.String>() {
            @java.lang.Override
            public void onReceiveValue(java.lang.String value) {
            }
        });
    }else {
        this.loadUrl((((("javascript:js." + callbackFunction) + "((function(){") + js) + "})())"));
    }
}