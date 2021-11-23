@java.lang.Override
public void onClick(android.view.View view) {
    android.widget.Toast.makeText(getActivity(), "You changed reminder!", Toast.LENGTH_LONG).show();
    localReminder = new com.example.biorobot.memorymanager2.Reminder(eventDataType.getText().toString().trim(), eventDataDesc.getText().toString().trim(), localReminder.getTime(), eventDataAlarm.isChecked());
    commEvent.returnReminder(localReminder);
}