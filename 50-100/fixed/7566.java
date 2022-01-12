private void stopRecording() {
    recorder.stop();
    broadcastIntent.putExtra("time", "");
    sendBroadcast(broadcastIntent);
    customHandler.removeCallbacks(updateTimerThread);
    timeSwapBuff = 0L;
    recorder.reset();
    recorder.release();
    recorder = null;
}