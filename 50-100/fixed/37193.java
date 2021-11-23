@java.lang.Override
public void onPositiveActionClicked(com.rey.material.app.DialogFragment fragment) {
    com.rey.material.app.DatePickerDialog dialog = ((com.rey.material.app.DatePickerDialog) (fragment.getDialog()));
    java.lang.String date = dialog.getFormattedDate(java.text.SimpleDateFormat.getDateInstance());
    android.widget.Toast.makeText(fragment.getDialog().getContext(), ("Date is " + date), Toast.LENGTH_SHORT).show();
    fragment.dismiss();
}