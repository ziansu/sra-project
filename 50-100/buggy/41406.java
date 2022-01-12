@java.lang.Override
public void success(retrofit.client.Response jsonElement, retrofit.client.Response response) {
    if ((jsonElement != null) && ((jsonElement.getBody()) != null)) {
        com.fillr.browsersdk.Fillr.javascriptData = new java.lang.String(((retrofit.mime.TypedByteArray) (jsonElement.getBody())).getBytes());
        if (loadWidgetAfterFinish) {
            if (((mWebView) != null) && ((mWebView.getVisibility()) == (android.view.View.VISIBLE))) {
                loadWidgetAndGetFields();
            }
        }
    }
}