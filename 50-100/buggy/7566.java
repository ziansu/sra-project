private void stopRecording() {
    recorder.stop();
    broadcastIntent.putExtra("time", "");
    sendBroadcast(broadcastIntent);
    timeSwapBuff += timeInMilliseconds;
    customHandler.removeCallbacks(updateTimerThread);
    recorder.reset();
    recorder.release();
    recorder = null;
}