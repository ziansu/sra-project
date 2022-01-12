public void setTime(android.view.View v) {
    java.lang.String appointmentTime = (("" + (timePicker.getHour())) + " : ") + (timePicker.getMinute());
    org.nullpointer.doctor.Message.message(getApplicationContext(), appointmentTime);
    org.nullpointer.doctor.SetAppointmentTime.BackgroundTask backgroundTask = new org.nullpointer.doctor.SetAppointmentTime.BackgroundTask(this);
    backgroundTask.execute(Name, Contact, appointmentTime);
}