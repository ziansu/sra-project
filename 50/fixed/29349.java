@java.lang.Override
public void onReceivedError(org.apache.cordova.CordovaWebView me, int i, java.lang.String string, java.lang.String url) {
    this.onReceivedLoadError(((org.xwalk.core.XWalkView) (me.getView())), i, string, url);
}