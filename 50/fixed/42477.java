@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int progresValue, boolean fromUser) {
    progress = progresValue;
    if ((sunView) != null) {
        sunView.redraw(progress);
    }
}