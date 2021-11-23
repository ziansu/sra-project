@java.lang.Override
public boolean f(com.google.gwt.user.client.Event e) {
    com.google.gwt.query.client.GQuery el = $(e.getEventTarget());
    com.cgxlib.core.component.tab.ViewHandler<?> viewHandler = com.cgxlib.core.component.tab.CGXHelper.getViewHandlerAsData(el);
    if ((viewHandler != null) && (viewHandler instanceof com.cgxlib.core.component.tab.TabView.ViewHandler)) {
        el.as(CGXlib.CGX).as(com.cgxlib.core.component.tab.Tab.CGX, viewHandler).show();
    }else {
        el.as(com.cgxlib.core.component.tab.Tab.CGX).show();
    }
    return false;
}