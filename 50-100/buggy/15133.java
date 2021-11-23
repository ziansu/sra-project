public void resetChrono(android.view.View view) throws java.lang.InterruptedException {
    java.lang.Thread.sleep(200);
    stcButton34.setText("START");
    chronometerModified.stop();
    chronometerModified.setBase(android.os.SystemClock.elapsedRealtime());
    timeWhenStoppedModified = (chronometerModified.getBase()) - (android.os.SystemClock.elapsedRealtime());
    gameStarted = false;
    isStopped = true;
}