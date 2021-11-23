@java.lang.Override
public boolean process(be.tarsos.dsp.AudioEvent audioEvent) {
    if (audioEvent == null)
        return false;
    
    android.util.Log.d("recording audio", java.lang.String.valueOf(audioEvent.getTimeStamp()));
    if (this.firstRun) {
        android.os.Process.setThreadPriority(android.os.Process.THREAD_PRIORITY_AUDIO);
        this.firstRun = java.lang.Boolean.TRUE;
    }
    try {
        this.file.write(audioEvent.getByteBuffer(), 0, audioEvent.getBufferSize());
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return true;
}