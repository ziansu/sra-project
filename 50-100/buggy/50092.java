void appendToFile(java.io.File file, long actualArrivalTimestamp) {
    java.lang.String predictionLine = ((((((name) + ",") + (bus.Utils.convertTimestampToDate(predictionTimestamp))) + ",") + (bus.Utils.convertTimestampToDate(actualArrivalTimestamp))) + ",") + (actualArrivalTimestamp - (predictedTimestamp));
    bus.Utils.appendLineToFile(file, predictionLine);
}