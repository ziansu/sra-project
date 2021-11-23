@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int progress, boolean fromUser) {
    float defaultSpeed = (((float) (speedBar.getProgress())) * 10.0F) / ((float) (speedBar.getMax()));
    myView.setBallSpeed(defaultSpeed);
    AnimationView.count = 0;
    AnimationView.distance = 0;
    myView.invalidate();
}