@java.lang.Override
public void onProgressChanged(@android.support.annotation.NonNull
final android.widget.SeekBar seekBar, final int progress, final boolean fromUser) {
    mImageView.setBrightness((((((float) (seekBar.getProgress())) / (seekBar.getMax())) * 2) - 1));
}