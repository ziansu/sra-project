@java.lang.Override
public void onDateSelected(java.util.Date date) {
    java.text.DateFormat df = android.text.format.DateFormat.getLongDateFormat(this);
    this.datePicker.setText(df.format(date));
    if ((this.modele) != null) {
        this.modele.setDatePeremption(date);
    }
}