private void resumeMediaPlay() {
    IS_ALERT_SHOWING = false;
    if (((mediaPlayerManager) != null) && ((AUDIO_CURRENT_POSITION) != (jp.co.efusion.utility.Default.ZERO))) {
        mediaPlayerManager.resumeAudio(AUDIO_CURRENT_POSITION);
    }else {
        if (IS_TIMER_RUNNING) {
            onMediaCompletion();
            IS_TIMER_RUNNING = false;
            TIMER_REMAINING_TIME = jp.co.efusion.utility.Default.ZERO;
        }
    }
}