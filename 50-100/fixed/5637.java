@org.junit.Test
public void setDate_java_util_date() {
    com.ddiehl.timesincetextview.TimeSinceTextView view = new com.ddiehl.timesincetextview.TimeSinceTextView(getContext());
    view.setDate(new java.util.Date((((mTime) - ((24 * 60) * 60)) * 1000)));
    org.hamcrest.MatcherAssert.assertThat(view.getText().toString(), com.ddiehl.timesincetextview.TimeSinceTextViewAndroidTest.is(getQuantityString(R.plurals.tstv_timespan_days, 1)));
}