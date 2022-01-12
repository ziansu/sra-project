void increaseBy10Hz() {
    freqOfTone = (freqOfTone) + 10;
    seekBar = ((android.widget.SeekBar) (findViewById(R.id.frequency_slider)));
    seekBar.setProgress(((seekBar.getProgress()) + 10));
    final java.lang.Thread thread = new java.lang.Thread(new java.lang.Runnable() {
        public void run() {
            genTone();
            handler.post(new java.lang.Runnable() {
                public void run() {
                    playSound();
                }
            });
        }
    });
    thread.start();
}