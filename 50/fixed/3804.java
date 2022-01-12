@java.lang.Override
public void postLayout() {
    final java.util.Iterator<com.google.gwt.user.client.ui.Widget> it = getWidget().iterator();
    while (it.hasNext()) {
        final com.google.gwt.user.client.ui.Widget w = it.next();
        w.setWidth("100%");
    } 
}