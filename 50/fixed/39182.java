@java.lang.Override
public void onTouchCancel(com.google.gwt.event.dom.client.TouchCancelEvent event) {
    touchCancelled = true;
    initialX = initialY = 0;
}