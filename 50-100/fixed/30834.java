@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int progress, boolean fromUser) {
    tvX.setText(("" + ((mSeekBarX.getProgress()) + 1)));
    tvY.setText(("" + (mSeekBarY.getProgress())));
    setData(((mSeekBarX.getProgress()) + 1), mSeekBarY.getProgress());
    mChart.invalidate();
}