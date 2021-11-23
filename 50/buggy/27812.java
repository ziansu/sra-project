@java.lang.Override
public void setAmbientMode(java.lang.Boolean ambientMode) {
    if (ambientMode) {
        averagingCallbackSensor.stopListening();
    }else
        if (isVisible()) {
            averagingCallbackSensor.startListening();
        }
    
    super.setAmbientMode(ambientMode);
}