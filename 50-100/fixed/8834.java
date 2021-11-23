@java.lang.Override
public void onTouchMove(com.google.gwt.event.dom.client.TouchMoveEvent event) {
    if (((initialX) == 0) && ((initialY) == 0)) {
        com.google.gwt.dom.client.Touch touch = event.getTouches().get(0);
        initialX = touch.getPageX();
        initialY = touch.getPageY();
    }
}