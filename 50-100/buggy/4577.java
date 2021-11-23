@java.lang.Override
public void setEnabled(boolean enabled) {
    if (!enabled) {
        mBarColor = com.appyvet.rangebar.RangeBar.DEFAULT_BAR_COLOR;
        mConnectingLineColor = com.appyvet.rangebar.RangeBar.DEFAULT_BAR_COLOR;
        mCircleColor = com.appyvet.rangebar.RangeBar.DEFAULT_BAR_COLOR;
        mTickColor = com.appyvet.rangebar.RangeBar.DEFAULT_BAR_COLOR;
    }else {
        mBarColor = mActiveBarColor;
        mConnectingLineColor = mActiveConnectingLineColor;
        mCircleColor = mActiveCircleColor;
        mTickColor = mActiveTickColor;
    }
    createBar();
    createPins();
    createConnectingLine();
    super.setEnabled(enabled);
}