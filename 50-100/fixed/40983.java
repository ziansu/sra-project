@java.lang.Override
public void onClick(android.view.View v) {
    com.waynehillsfbla.waynehillsnow.DetailedEventActivity.AddAttendance addAttendance = new com.waynehillsfbla.waynehillsnow.DetailedEventActivity.AddAttendance();
    addAttendance.execute(userEventData);
    cancelButton.setEnabled(true);
    attendButton.setEnabled(false);
    android.widget.Toast.makeText(getApplicationContext(), "You are now attending", Toast.LENGTH_SHORT).show();
}