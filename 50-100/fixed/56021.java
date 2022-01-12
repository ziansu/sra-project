public void startStopButtonClick(android.view.View view) {
    android.widget.Button btn = ((android.widget.Button) (findViewById(R.id.button_startstop)));
    if (!(flagStarted)) {
        startLogging();
        btn.setText("Stop");
    }else {
        stopLogging();
        btn.setText("Start");
    }
    flagStarted = !(flagStarted);
}