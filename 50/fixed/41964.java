public void handleMagnetometerEvent(no.ntnu.item.its.osgi.train.adapter.handlers.common.readings.MagnetometerReading reading) {
    trainState.magnetometerUpdate(reading);
}