@java.lang.Override
public void onMessageReceived(java.lang.String endpointId, byte[] payload, boolean isReliable) {
    android.util.Log.d(com.team2.android.proctor.ui.AttendanceFragment.TAG, ("onMessageReceived:" + (new java.lang.String(payload))));
    java.lang.String message = new java.lang.String(payload);
    attendance = new com.team2.android.proctor.model.input.Attendance();
    attendance.setUserId(java.lang.Long.parseLong(message.split(":")[0]));
    attendance.setCourseId(java.lang.Integer.parseInt(message.split(":")[1]));
    new com.team2.android.proctor.ui.AttendanceFragment.TakeAttendanceTask().execute(attendance);
}