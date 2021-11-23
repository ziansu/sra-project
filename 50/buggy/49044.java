public void handleMessage(java.lang.String message) {
    org.appcelerator.kroll.common.Log.v(org.appcelerator.kroll.runtime.v8.JSDebugger.TAG, ("Received message from V8: " + message));
    v8Messages.add(message);
}