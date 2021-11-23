@java.lang.Override
public void onDateSet(android.widget.DatePicker datePicker, int year, int month, int day) {
    org.joda.time.DateTime datetime = new org.joda.time.DateTime(year, (month + 1), day, 0, 0);
    startDate = (datetime.getMillis()) / 1000;
    startTimeBox.setText(edu.usc.sunset.team7.www.parkhere.Utils.Tools.getDateString(year, (month + 1), day));
}