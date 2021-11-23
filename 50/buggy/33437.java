@java.lang.Override
public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
    _processed = true;
    android.widget.Toast.makeText(getApplicationContext(), "Przetworzono ", Toast.LENGTH_LONG).show();
}