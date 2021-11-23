@java.lang.Override
public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
    mTextSeekBar.setText(((("Shutter Speed(in ns):" + ((mSeekbar.getProgress()) + ShutterSpeed1)) + "/") + (java.lang.Math.round(((mSeekbar.getMax()) + ShutterSpeed1)))));
    android.widget.Toast.makeText(getApplicationContext(), "Setting Shutter Speed", Toast.LENGTH_SHORT).show();
    ShutterSpeedValue = (mSeekbar.getProgress()) + ShutterSpeed1;
    AutoNumber = 1;
    startPreview();
}