private void startMussicOnclick(int raw) {
    final int r = raw;
    if ((mpOnClick) != null)
        if (mpOnClick.isPlaying())
            mpOnClick.stop();
        
    
    java.lang.Runnable runnable = new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            mpOnClick = android.media.MediaPlayer.create(com.android.sjsofteducationapp.StudyActivity.this, r);
            mpOnClick.start();
        }
    };
    thread = new java.lang.Thread(runnable);
    thread.start();
}