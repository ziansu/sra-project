@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int progress, boolean fromUser) {
    mMosaicView.setStrokeMultiples((1 + ((float) (progress / 100.0))));
}