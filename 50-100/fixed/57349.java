@java.lang.Override
public void run() {
    if ((player) != null) {
        if (player.isPlaying()) {
            int position = player.getCurrrentDuration();
            seekbar.setProgress(position);
        }
    }
    mHandler.postDelayed(runnable, 1000);
}