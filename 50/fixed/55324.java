@java.lang.Override
public void onClick(android.view.View view) {
    if ((inAppWebView) != null) {
        emitButtonEvent(buttonDef, inAppWebView.getUrl(), index);
    }
}