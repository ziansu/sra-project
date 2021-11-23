@java.lang.Override
public void onDateChosen(java.util.Calendar calendar) {
    datePicker.setText(getFormattedDate(calendar.getTime()));
    dream.setDate(calendar.getTime());
}