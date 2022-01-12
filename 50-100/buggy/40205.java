@java.lang.Override
public void onClick(android.view.View view) {
    android.widget.Toast.makeText(getActivity(), "You changed reminder!", Toast.LENGTH_LONG).show();
    localReminder = new com.example.biorobot.memorymanager2.Reminder(eventDataType.getText().toString().trim(), eventDataDesc.getText().toString().trim(), java.lang.Integer.parseInt(eventDataTime.getText().toString().trim()), eventDataAlarm.isChecked());
    commEvent.returnReminder(localReminder);
}