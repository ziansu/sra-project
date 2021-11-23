private void flushPredictions(bus.Trip trip) {
    bus.Prediction[] predictions = lastStopPredictions.get(trip.name);
    if (predictions != null) {
        for (bus.Prediction prediction : predictions) {
            if (prediction != null) {
                prediction.appendToFile(loggingFile, trip.lastPoint().timestamp);
            }
        }
    }
}