private void startChronometer(android.view.View view) {
    android.widget.Chronometer chronometer = ((android.widget.Chronometer) (layout.findViewById(R.id.trip_timer)));
    chronometer.setBase(android.os.SystemClock.elapsedRealtime());
    chronometer.start();
    hideSoftKeyboard();
}