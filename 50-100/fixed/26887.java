@java.lang.Override
public void onCompletion(android.media.MediaPlayer mp) {
    mp.reset();
    (currentObject)++;
    if ((currentObject) < 3) {
        handler.postDelayed(soundAndObjectRunnable, 1000);
    }else {
        mp.release();
        if (mp != null) {
            mp.release();
        }
        finish();
    }
}