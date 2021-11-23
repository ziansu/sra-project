public static android.app.PendingIntent getPendingSelfIntent(android.content.Context context, java.lang.String action, java.lang.String extra, int mMovieid) {
    android.content.Intent intent = new android.content.Intent();
    intent.setAction(action);
    android.os.Bundle bundle = new android.os.Bundle();
    bundle.putInt(extra, mMovieid);
    intent.putExtras(bundle);
    return android.app.PendingIntent.getBroadcast(context, 0, intent, 0);
}