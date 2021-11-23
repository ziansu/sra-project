static final android.content.Context getApplicationContextIfAvailable(android.content.Context context) {
    final android.content.Context ac = context.getApplicationContext();
    return ac != null ? ac : android.app.ActivityThread.currentApplication().getApplicationContext();
}