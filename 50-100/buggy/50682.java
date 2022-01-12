protected void start() {
    if (!(mRunning)) {
        if (!(mDecoderStatusPaused.equals(bg.cytec.android.fskmodem.FSKDecoder.DecoderStatus.IDLE))) {
            setStatus(mDecoderStatusPaused);
        }else {
            setStatus(bg.cytec.android.fskmodem.FSKDecoder.DecoderStatus.SEARCHING_SIGNAL);
        }
        mRunning = true;
        mThread = new java.lang.Thread(mProcessor);
        mThread.setPriority(java.lang.Thread.MIN_PRIORITY);
        mThread.start();
        android.util.Log.d("WaterLevel", "start mProcessor");
    }
}