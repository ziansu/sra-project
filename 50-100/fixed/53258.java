public void onProgressChanged(android.widget.SeekBar seek, int value, boolean fromTouch) {
    mCurrentValue = value + (mMinValue);
    mCurrentValue = (mCurrentValue) / (fr.uppa.waam.util.SeekBarPreference.STEP);
    mCurrentValue = (mCurrentValue) * (fr.uppa.waam.util.SeekBarPreference.STEP);
    mValueText.setText(java.lang.Integer.toString(mCurrentValue));
}