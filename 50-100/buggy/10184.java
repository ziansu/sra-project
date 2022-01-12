@org.junit.Test
public void getFormattedDateString_6days() {
    org.hamcrest.MatcherAssert.assertThat(com.ddiehl.timesincetextview.TimeSince.getFormattedDateString((((mTime) - ((((1 * 7) * 24) * 60) * 60)) + 1), mTime, false, com.ddiehl.timesincetextview.TimeSinceTextViewAndroidTest.mContext), com.ddiehl.timesincetextview.TimeSinceTextViewAndroidTest.is(getQuantityString(R.plurals.tstv_timespan_days, 6)));
}