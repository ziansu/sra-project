public void onAccelerationChanged(float p_x, float p_y, float p_z, float p_timestamp) {
    com.runrev.android.Engine.doAccelerationChanged(p_x, p_y, p_z, p_timestamp);
    if (m_wake_on_event)
        com.runrev.android.Engine.doProcess(false);
    
}