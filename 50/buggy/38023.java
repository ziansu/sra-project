@org.junit.Test
public void getFormattedDateString_now() {
    org.hamcrest.MatcherAssert.assertThat(com.ddiehl.timesincetextview.TimeSince.getFormattedDateString(((mTime) - 10), mTime, false, com.ddiehl.timesincetextview.TimeSinceTextViewAndroidTest.mContext), com.ddiehl.timesincetextview.TimeSinceTextViewAndroidTest.is(com.ddiehl.timesincetextview.TimeSinceTextViewAndroidTest.mContext.getString(R.string.tstv_timespan_now)));
}