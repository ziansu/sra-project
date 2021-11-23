@java.lang.Override
public void onPause() {
    super.onPause();
    savedInstance = new android.os.Bundle();
    onSaveInstanceState(savedInstance);
    timingThread.stopTimer();
    handler.removeCallbacks(toggleInputMode);
}