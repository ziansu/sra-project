@java.lang.Override
protected java.lang.Void doInBackground(java.lang.Void... params) {
    if (handler.connectToServer()) {
        handler.bindToBroadcastQueue();
    }
    return null;
}