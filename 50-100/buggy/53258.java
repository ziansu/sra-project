public void onProgressChanged(android.widget.SeekBar seek, int value, boolean fromTouch) {
    mCurrentValue = value + (mMinValue);
    mCurrentValue = ((int) (java.lang.Math.round((value / (fr.uppa.waam.util.SeekBarPreference.STEP))))) * (fr.uppa.waam.util.SeekBarPreference.STEP);
    if (value < 50) {
        mCurrentValue = 50;
    }
    if (value > 450) {
        mCurrentValue = 500;
    }
    seek.setProgress(mCurrentValue);
    mValueText.setText(java.lang.Integer.toString(mCurrentValue));
}