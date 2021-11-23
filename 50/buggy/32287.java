@java.lang.Override
public void onPause() {
    super.onPause();
    if ((audioEngine) != null) {
        this.stopAudioEngine();
    }
}