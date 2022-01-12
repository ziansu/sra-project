public boolean unbind(android.content.Context context, java.lang.Object connection) throws java.lang.Exception {
    android.content.Intent intent = mServiceIntents.get(connection);
    onUnbind(context, intent);
    return intent != null;
}