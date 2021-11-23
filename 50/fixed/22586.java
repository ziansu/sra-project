@java.lang.Override
public void run() {
    java.io.File recording = getDistortedRecording();
    mplayer.play(recording);
}