@org.junit.Test
public void setDate_long() {
    com.ddiehl.timesincetextview.TimeSinceTextView view = new com.ddiehl.timesincetextview.TimeSinceTextView(getContext());
    view.setDate(((mTime) - ((24 * 60) * 60)));
    org.hamcrest.MatcherAssert.assertThat(view.getText().toString(), com.ddiehl.timesincetextview.TimeSinceTextViewAndroidTest.is(getQuantityString(R.plurals.tstv_timespan_days, 1)));
}