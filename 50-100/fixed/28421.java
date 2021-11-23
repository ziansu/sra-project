@org.junit.Test
public void getFormattedDateString_23hours() {
    org.hamcrest.MatcherAssert.assertThat(com.ddiehl.timesincetextview.TimeSince.getFormattedDateString((((mTime) - ((24 * 60) * 60)) + 1), mTime, false, getContext()), com.ddiehl.timesincetextview.TimeSinceTextViewAndroidTest.is(getQuantityString(R.plurals.tstv_timespan_hours, 23)));
}