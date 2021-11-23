@java.lang.Override
public void dispatch(com.facebook.react.uimanager.events.RCTEventEmitter rctEventEmitter) {
    com.facebook.react.bridge.WritableMap error = com.facebook.react.bridge.Arguments.createMap();
    error.putInt(com.brentvatne.react.ReactVideoEventDispatcher.EVENT_PROP_WHAT, mWhat);
    error.putInt(com.brentvatne.react.ReactVideoEventDispatcher.EVENT_PROP_EXTRA, mExtra);
    com.facebook.react.bridge.WritableMap eventData = com.facebook.react.bridge.Arguments.createMap();
    eventData.putMap(com.brentvatne.react.ReactVideoEventDispatcher.EVENT_PROP_ERROR, error);
    rctEventEmitter.receiveEvent(getViewTag(), getEventName(), eventData);
}