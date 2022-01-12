@java.lang.Override
public void onTimeSet(com.wdullaer.materialdatetimepicker.time.TimePickerDialog view, int hourOfDay, int minute, int second) {
    dateTimeSelected = dateTimeSelected.withHourOfDay(hourOfDay).withMinuteOfHour(minute).withSecondOfMinute(second);
    dateTimeView.setText(net.vexelon.currencybg.app.utils.DateTimeUtils.toDateTimeText(view.getActivity(), dateTimeSelected.toDate()));
}