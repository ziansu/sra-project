@java.lang.Override
public void postLayout() {
    java.util.Iterator<com.google.gwt.user.client.ui.Widget> it = getWidget().iterator();
    while (it.hasNext()) {
        com.google.gwt.user.client.ui.Widget w = it.next();
        w.setWidth("100%");
    } 
}