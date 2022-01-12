@org.protocoderrunner.apidoc.annotation.ProtoMethod(description = "Creates a new web view", example = "")
@org.protocoderrunner.apidoc.annotation.ProtoMethodParam(params = { "" })
public org.protocoderrunner.apprunner.api.widgets.PWebView newWebview() {
    initializeLayout();
    org.protocoderrunner.apprunner.api.widgets.PWebView webView = new org.protocoderrunner.apprunner.api.widgets.PWebView(getContext());
    return webView;
}