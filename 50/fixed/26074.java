private void stopChronometer(android.view.View view) {
    ((android.widget.Chronometer) (layout.findViewById(R.id.trip_timer))).stop();
    hideSoftKeyboard();
}