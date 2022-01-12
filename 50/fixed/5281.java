private void notifyChange(java.lang.String what) {
    android.content.Intent i = new android.content.Intent(what);
    sendBroadcast(i);
}