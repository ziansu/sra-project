public void onTick(long millisUntilFinished) {
    timeUntilFinished = millisUntilFinished;
    sendMessage(((int) (millisUntilFinished)));
}