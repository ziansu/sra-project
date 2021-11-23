@java.lang.Override
public void onPlayerFinished() {
    reactContext.getNativeModule(com.facebook.react.uimanager.UIManagerModule.class).getEventDispatcher().dispatchEvent(new com.facebook.react.uimanager.events.Event(view.getId(), android.os.SystemClock.uptimeMillis()) {
        @java.lang.Override
        public java.lang.String getEventName() {
            return com.greatdroid.reactnative.media.player.ReactMediaPlayerViewManager.EVENT_ON_PLAYER_FINISHED;
        }

        @java.lang.Override
        public void dispatch(com.facebook.react.uimanager.events.RCTEventEmitter rctEventEmitter) {
            rctEventEmitter.receiveEvent(getViewTag(), getEventName(), null);
        }
    });
}