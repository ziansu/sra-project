@java.lang.Override
public void onCompletion(android.media.MediaPlayer mp) {
    mp.release();
    currentState = com.trojx.fangyan.activity.StoryActivity.STATUS_IDLE;
    ad.stop();
}