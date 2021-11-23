@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int progress, boolean fromUser) {
    mLevelText.setText(java.lang.String.format(getString(R.string.textLevelFormat), java.lang.String.format(getString(R.string.percentLevelFormat), progress)));
}