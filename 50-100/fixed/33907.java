@java.lang.Override
public void onClick(android.view.View v) {
    android.os.Bundle b = new android.os.Bundle();
    b.putString("setDate", dateCTR.revertDateAndChangeSeparator(textDate.getText().toString(), "/", "-"));
    br.com.inmypocket.dialogs.DatePickerFragment datePicker = new br.com.inmypocket.dialogs.DatePickerFragment();
    datePicker.setArguments(b);
    datePicker.show(getFragmentManager(), "datePicker");
}