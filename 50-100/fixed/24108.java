@java.lang.Override
public void removeView(java.lang.String componentName, java.lang.String viewName, java.lang.Object options) {
    for (java.util.Iterator<org.zaproxy.zap.extension.httppanel.view.HttpPanelView> it = views.iterator(); it.hasNext();) {
        org.zaproxy.zap.extension.httppanel.view.HttpPanelView httpPanelView = it.next();
        if (viewName.equals(httpPanelView.getName())) {
            ((org.zaproxy.zap.view.messagelocation.MessageLocationProducer) (httpPanelView)).removeFocusListener(focusListeners);
            it.remove();
            break;
        }
    }
    super.removeView(componentName, viewName, options);
}