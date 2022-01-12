private void timerFinished() {
    if (isStretchesRemaining()) {
        goToNextStretch();
        startTimer(returnCountdownTime());
        android.widget.Toast.makeText(getApplicationContext(), "Ding", Toast.LENGTH_SHORT).show();
    }else {
        reset();
        android.widget.Toast.makeText(getApplicationContext(), "Ding, Ding Ding!!!", Toast.LENGTH_SHORT).show();
    }
}