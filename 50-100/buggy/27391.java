@org.junit.Test
public void setDate_long() {
    com.ddiehl.timesincetextview.TimeSinceTextView view = new com.ddiehl.timesincetextview.TimeSinceTextView(com.ddiehl.timesincetextview.TimeSinceTextViewAndroidTest.mContext);
    view.setDate(((mTime) - (((1 * 24) * 60) * 60)));
    org.hamcrest.MatcherAssert.assertThat(view.getText().toString(), com.ddiehl.timesincetextview.TimeSinceTextViewAndroidTest.is(getQuantityString(R.plurals.tstv_timespan_days, 1)));
}