private void showTimerPickerDialog() {
    cbstudios.coffeebreak.view.activity.TaskEditActivity.TimePickerFragment fragment = new cbstudios.coffeebreak.view.activity.TaskEditActivity.TimePickerFragment();
    cal = java.util.Calendar.getInstance();
    fragment.setCalendar(cal);
    fragment.show(getFragmentManager(), "timePicker");
}