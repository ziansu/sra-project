@java.lang.Override
public com.google.android.gms.cast.framework.CastOptions getCastOptions(android.content.Context context) {
    com.google.android.gms.cast.framework.media.NotificationOptions notificationOptions = new com.google.android.gms.cast.framework.media.NotificationOptions.Builder().setActions(java.util.Arrays.asList(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK, MediaIntentReceiver.ACTION_STOP_CASTING), new int[]{ 1 }).build();
    com.google.android.gms.cast.framework.media.CastMediaOptions mediaOptions = new com.google.android.gms.cast.framework.media.CastMediaOptions.Builder().setNotificationOptions(notificationOptions).setImagePicker(new org.schabi.newpipe.CastOptionsProvider.ImagePickerImpl()).build();
    return new com.google.android.gms.cast.framework.CastOptions.Builder().setReceiverApplicationId(context.getString(R.string.chromecast_app_id)).setCastMediaOptions(mediaOptions).build();
}