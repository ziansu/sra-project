@java.lang.Override
public void onCompletion(android.media.MediaPlayer mp) {
    if (((curPosition) < (phraseFiles.size())) || (repeat)) {
        (curPosition)++;
        playQueue();
    }else {
        mp.release();
    }
}