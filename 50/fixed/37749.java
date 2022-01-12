@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    mMonthColorStrings = null;
    mCalendar = null;
    mDaysStrings = null;
    mCurrentMonth = null;
}