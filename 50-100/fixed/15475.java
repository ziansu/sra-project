@java.lang.Override
public void onFinish(java.lang.String responseText) {
    try {
        org.json.JSONObject response = new org.json.JSONObject(responseText);
        switch (response.getInt("status")) {
            case 0 :
                com.droidcare.control.Global.getAppointmentManager().addFinishedAppointment(appointment);
                com.droidcare.control.Global.getAppointmentManager().removePendingAppointment(appointment);
                android.util.Log.d("REMOVE PENDING TO FINISH", "REMOVED");
                break;
            default :
                android.util.Log.d("REMOVE PENDING TO FINISH", "FAILED");
                break;
        }
    } catch (org.json.JSONException e) {
    }
}