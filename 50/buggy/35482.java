@java.lang.Override
public void onDateSet(android.widget.DatePicker datePicker, int year, int month, int day) {
    textToEdit.setText(((((year + "-") + month) + "-") + day), TextView.BufferType.EDITABLE);
}