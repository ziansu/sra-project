@java.lang.Override
public void onClick(android.view.View view) {
    if ((mCalenderListener) != null) {
        mCalenderListener.onSelectDate(mStartDate);
    }
    mViewPager.setCurrentItem(mMiddlePoint);
}