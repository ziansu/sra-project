public void handleMagnetometerEvent(no.ntnu.item.its.osgi.train.adapter.handlers.common.readings.MagnetometerReading reading) {
    logger.info("Magnetometer event");
    trainState.magnetometerUpdate(reading);
}