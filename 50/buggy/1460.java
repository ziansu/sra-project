@java.lang.Override
public void onMessage(java.lang.String message) {
    try {
        sendWrappedEvent(pageId, message);
    } catch (java.io.IOException | org.json.JSONException e) {
        com.facebook.common.logging.FLog.w(com.facebook.react.devsupport.InspectorPackagerConnection.TAG, "Couldn't send event to packager", e);
    }
}