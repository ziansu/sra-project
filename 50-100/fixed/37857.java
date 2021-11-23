public void onLocationChanged(double p_latitude, double p_longitude, double p_altitude, double p_timestamp, float p_accuracy, double p_speed, double p_course) {
    com.runrev.android.Engine.doLocationChanged(p_latitude, p_longitude, p_altitude, p_timestamp, p_accuracy, p_speed, p_course);
    if (m_wake_on_event)
        com.runrev.android.Engine.doProcess(false);
    
}