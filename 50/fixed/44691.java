@java.lang.Override
public void onBackPressed() {
    if (recording) {
        try {
            soundRecorder.stop();
        } catch (java.io.IOException e) {
        }
    }
    super.onBackPressed();
}