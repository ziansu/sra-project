@java.lang.Override
public void onClick(android.view.View v) {
    android.support.v4.app.DialogFragment newFragment = new pl.dom133.dzwonek.TimePickerFragment(((android.widget.EditText) (deleteDialog.findViewById(R.id.od_time))), ts);
    newFragment.show(getSupportFragmentManager(), "timePicker");
}