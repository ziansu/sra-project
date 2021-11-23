public void unbind(android.content.Context context, java.lang.Object connection) throws java.lang.Exception {
    android.content.Intent intent = mServiceIntents.get(connection);
    if (intent != null) {
        onUnbind(context, intent);
    }
}