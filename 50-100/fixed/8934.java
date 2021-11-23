public void onHeadingChanged(double p_heading, double p_magnetic_heading, double p_true_heading, double p_timestamp, float p_x, float p_y, float p_z, float p_accuracy) {
    com.runrev.android.Engine.doHeadingChanged(p_heading, p_magnetic_heading, p_true_heading, p_timestamp, p_x, p_y, p_z, p_accuracy);
    if (m_wake_on_event)
        com.runrev.android.Engine.doProcess(false);
    
}