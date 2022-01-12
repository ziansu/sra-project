@java.lang.Override
public void onTouchEnd(com.google.gwt.event.dom.client.TouchEndEvent event) {
    if (newCreationMode) {
        setFocus(true);
    }
    long time = java.lang.System.currentTimeMillis();
    if ((time - (latestTouchEndTime)) < 500) {
        latestTouchEndTime = time;
        if (!(newCreationMode)) {
            onDoubleClickAction(false, false);
        }
    }else {
        latestTouchEndTime = time;
    }
    longTouchManager.cancelTimer();
    geogebra.html5.event.PointerEvent wrappedEvent = geogebra.html5.event.PointerEvent.wrapEvent(event, ZeroOffset.instance);
    onPointerUp(wrappedEvent);
    geogebra.html5.gui.util.CancelEventTimer.touchEventOccured();
}