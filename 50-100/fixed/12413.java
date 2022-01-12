@java.lang.Override
public void onTextChanged(final java.lang.CharSequence s, int start, int before, int count) {
    if (inputString.getText().toString().equals(random)) {
        handler.removeCallbacks(runnable);
        service = false;
        stopService(closeDialog);
        player.release();
        vibrator.cancel();
        resetAlarm();
        finish();
    }else {
        player.pause();
        vibrator.cancel();
        handler.removeCallbacks(runnable);
    }
}