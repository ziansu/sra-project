@java.lang.Override
public void onTouchStart(com.google.gwt.event.dom.client.TouchStartEvent event) {
    touchCancelled = false;
    com.google.gwt.dom.client.Touch touch = event.getTouches().get(0);
    initialX = touch.getPageX();
    initialY = touch.getPageY();
}