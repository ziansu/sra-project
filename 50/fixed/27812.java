@java.lang.Override
public void setAmbientMode(java.lang.Boolean ambientMode) {
    if ((!ambientMode) && (isVisible())) {
        averagingCallbackSensor.startListening();
    }else {
        averagingCallbackSensor.stopListening();
    }
    super.setAmbientMode(ambientMode);
}