@org.junit.Test
public void getFormattedDateString_1day() {
    org.hamcrest.MatcherAssert.assertThat(com.ddiehl.timesincetextview.TimeSince.getFormattedDateString(((mTime) - (((1 * 24) * 60) * 60)), mTime, false, com.ddiehl.timesincetextview.TimeSinceTextViewAndroidTest.mContext), com.ddiehl.timesincetextview.TimeSinceTextViewAndroidTest.is(getQuantityString(R.plurals.tstv_timespan_days, 1)));
}