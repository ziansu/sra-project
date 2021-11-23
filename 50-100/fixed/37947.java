@org.junit.Test
public void getFormattedDateString_1week() {
    org.hamcrest.MatcherAssert.assertThat(com.ddiehl.timesincetextview.TimeSince.getFormattedDateString(((mTime) - (((7 * 24) * 60) * 60)), mTime, false, getContext()), com.ddiehl.timesincetextview.TimeSinceTextViewAndroidTest.is(getQuantityString(R.plurals.tstv_timespan_weeks, 1)));
}