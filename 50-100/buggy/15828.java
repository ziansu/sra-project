@java.lang.Override
public void onClick(android.view.View v) {
    org.joda.time.format.DateTimeFormatter dateTimeFormatter = org.joda.time.format.DateTimeFormat.forPattern("dd/MM/yy");
    org.joda.time.DateTime dateTime = new org.joda.time.DateTime(mDialogDatePicker.getYear(), mDialogDatePicker.getMonth(), mDialogDatePicker.getDayOfMonth(), 0, 0);
    java.lang.String date = dateTimeFormatter.print(dateTime);
    mDateTextView.setText(date);
    dialog.dismiss();
}