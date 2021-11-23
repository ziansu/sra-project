private void changeBrightness(int brightness, java.lang.String extra) {
    android.widget.TextView text = ((android.widget.TextView) (findViewById(R.id.textView)));
    text.setText(((("Brightness: " + brightness) + " ") + extra));
    if ((brightness > 0) && (brightness < 100))
        android.provider.Settings.System.putInt(getContentResolver(), android.provider.Settings.System.SCREEN_BRIGHTNESS, ((int) (brightness)));
    
}