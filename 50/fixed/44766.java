@java.lang.Override
public void onDateSetSuccess(java.util.Date date) {
    mDob = date;
    java.lang.String dateString = com.lftechnology.khop.khop.utils.DateUtils.getDateString(date, com.lftechnology.khop.khop.activity.AddChildActivity.DATE_FORMAT);
    mDateOfBirth.setText(dateString);
}