@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    if (intent.getAction().equals(AudioManager.ACTION_AUDIO_BECOMING_NOISY)) {
        android.content.Intent stopPlayerIntent = new android.content.Intent(BackgroundAudioPlayerPlugin.mainActivity.getApplicationContext(), src.android.BackgroundAudioPlayerService.class);
        stopPlayerIntent.putExtra(BackgroundAudioPlayerPlugin.EXTRA_ACTION, "action.stop");
        BackgroundAudioPlayerPlugin.mainActivity.startService(stopPlayerIntent);
    }
}