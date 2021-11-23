@java.lang.Override
public void onDateSet(com.tt.reminder.fragment.DatePicker view, int year, int monthOfYear, int dayOfMonth) {
    mTaskBean.setYear(year);
    mTaskBean.setMonth(monthOfYear);
    mTaskBean.setDayOfMonth(dayOfMonth);
    updateEditedViewStatue(EDITED_VIEW.PICKED_DATE, mAlarmDate, mTaskBean.getPickedDate());
}