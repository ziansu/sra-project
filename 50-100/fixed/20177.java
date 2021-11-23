@java.lang.Override
public void changeUiOnStartMeasure() {
    mHeartDrawable.startTwinkle();
    mPwHeartrate.resetCount(false);
    mBtnToggle.setVisibility(View.INVISIBLE);
    mIvLineStart.setVisibility(View.INVISIBLE);
    mWvStart.setVisibility(View.VISIBLE);
    mTvDoneTimeMeasure.setVisibility(View.GONE);
    mMeasureState = com.ape.heartrate.activity.HeartRateActivity.MEASURE_STATE_ING;
}