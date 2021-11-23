@java.lang.Override
public void onCompletion(android.media.MediaPlayer mp) {
    isCompleted = true;
    musicController.setImageResource(R.drawable.icon_play);
}