private dataSets.SensorData getNextSensor() throws exceptions.QueueException {
    synchronized(this) {
        try {
            return Application.sdq.getFirst();
        } catch (java.util.NoSuchElementException e) {
            throw new exceptions.QueueException(e);
        }
    }
}