private void stopSensors() {
    if ((sm) != null) {
        sm.unregisterListener(accEventListener);
        sm.unregisterListener(gyroEventListener);
    }
    if ((ttv) != null) {
        ttv.stop();
    }
}