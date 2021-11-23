public dataSets.SensorData getNextSensor() throws exceptions.QueueException {
    try {
        return Application.sdq.getFirst();
    } catch (java.util.NoSuchElementException e) {
        throw new exceptions.QueueException(e);
    }
}