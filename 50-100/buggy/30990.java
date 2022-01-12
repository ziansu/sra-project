@java.lang.Override
public void run() {
    stopCollectingAudio = false;
    java.util.concurrent.LinkedBlockingQueue<short[]> audioHolder = new java.util.concurrent.LinkedBlockingQueue<short[]>();
    recorder.setAudioListener(audioHolder);
    CollectAudio(audioHolder);
    recorder.setAudioListener(null);
    DrainAudio(audioHolder);
    currentEntry.close();
    if (onStopListener != null)
        onStopListener.onStop();
    
    audioCollectionThread = null;
}