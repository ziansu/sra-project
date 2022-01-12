@org.junit.Test
public void getFormattedDateString_59minutes() {
    org.hamcrest.MatcherAssert.assertThat(com.ddiehl.timesincetextview.TimeSince.getFormattedDateString((((mTime) - ((1 * 60) * 60)) + 1), mTime, false, com.ddiehl.timesincetextview.TimeSinceTextViewAndroidTest.mContext), com.ddiehl.timesincetextview.TimeSinceTextViewAndroidTest.is(getQuantityString(R.plurals.tstv_timespan_minutes, 59)));
}