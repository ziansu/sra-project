@java.lang.Override
public void onStop() {
    super.onStop();
    if ((voiceOutput) != null) {
        voiceOutput.killService();
    }
}