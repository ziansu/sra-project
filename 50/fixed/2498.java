@java.lang.Override
public void updateTime(java.lang.String time) {
    if ((mTvDataMoveTime) != null) {
        mTvDataMoveTime.setText(time);
    }
    mTvMoveDuration.setText(time);
}