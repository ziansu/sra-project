@java.lang.Override
public void onPositiveActionClicked(com.rey.material.app.DialogFragment fragment) {
    com.rey.material.app.TimePickerDialog dialog = ((com.rey.material.app.TimePickerDialog) (fragment.getDialog()));
    android.widget.Toast.makeText(fragment.getActivity(), ("Time is " + (dialog.getFormattedTime(java.text.SimpleDateFormat.getTimeInstance()))), Toast.LENGTH_SHORT).show();
    fragment.dismiss();
}