@java.lang.Override
public void onBackPressed() {
    super.onBackPressed();
    if (recording) {
        try {
            soundRecorder.stop();
        } catch (java.io.IOException e) {
        }
    }
}