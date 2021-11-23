@org.junit.Test
public void getFormattedDateString_59seconds() {
    org.hamcrest.MatcherAssert.assertThat(com.ddiehl.timesincetextview.TimeSince.getFormattedDateString(((mTime) - 59), mTime, false, com.ddiehl.timesincetextview.TimeSinceTextViewAndroidTest.mContext), com.ddiehl.timesincetextview.TimeSinceTextViewAndroidTest.is(getQuantityString(R.plurals.tstv_timespan_seconds, 59)));
}