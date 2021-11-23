@java.lang.Override
public void onDisconnect() {
    try {
        mInspectorConnections.remove(pageId);
        sendEvent("disconnect", makePageIdPayload(pageId));
    } catch (java.io.IOException | org.json.JSONException e) {
        com.facebook.common.logging.FLog.w(com.facebook.react.devsupport.InspectorPackagerConnection.TAG, "Couldn't send event to packager", e);
    }
}