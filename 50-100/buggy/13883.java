@java.lang.Override
public void dispatch(com.facebook.react.uimanager.events.RCTEventEmitter rctEventEmitter) {
    com.facebook.react.bridge.WritableMap eventData = com.facebook.react.bridge.Arguments.createMap();
    eventData.putInt(com.brentvatne.react.ReactVideoEventDispatcher.EVENT_PROP_WHAT, mWhat);
    eventData.putInt(com.brentvatne.react.ReactVideoEventDispatcher.EVENT_PROP_EXTRA, mExtra);
    com.facebook.react.bridge.WritableMap event = com.facebook.react.bridge.Arguments.createMap();
    event.putMap(com.brentvatne.react.ReactVideoEventDispatcher.EVENT_PROP_ERROR, eventData);
    rctEventEmitter.receiveEvent(getViewTag(), getEventName(), eventData);
}