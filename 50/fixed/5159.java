@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int progress, boolean fromUser) {
    float value = ((progress * stepAgl) * 30) / 52;
    CurrentAngle.setText(java.lang.Float.toString(value));
}