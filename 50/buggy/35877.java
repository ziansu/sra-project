@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int progress, boolean fromUser) {
    if ((train1) != null) {
        train1.setSpeed(progress);
        java.lang.String text = train1.GetSpeedTxt();
        setSpeed(progress, train1);
    }
}