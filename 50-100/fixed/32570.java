private void updateDisplay() {
    if (mWholeNumbersSelected) {
        mTempoSetting.setText((((int) (mBPM)) + ""));
    }else {
        mTempoSetting.setText(((((float) ((int) ((mBPM) * 10))) / 10) + ""));
    }
}