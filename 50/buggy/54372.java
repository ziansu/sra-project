@java.lang.Override
public com.google.gwt.event.shared.HandlerRegistration addZoomResizeHandler(com.github.timeu.gwtlibs.geneviewer.client.event.ZoomResizeEvent.Handler handler) {
    sinkEvents(com.github.timeu.gwtlibs.geneviewer.client.event.ZoomResizeEvent.getType(), handler);
    return addHandler(handler, com.github.timeu.gwtlibs.geneviewer.client.event.ZoomResizeEvent.getType());
}