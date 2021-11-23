void appendToFile(java.io.File file, long actualArrivalTimestamp) {
    java.lang.String predictionLine = ((((((name) + ",") + (bus.Utils.convertTimestampToDate(predictionTimestamp))) + ",") + (bus.Utils.convertTimestampToDate(predictedTimestamp))) + ",") + (bus.Utils.convertTimestampToDate(actualArrivalTimestamp));
    bus.Utils.appendLineToFile(file, predictionLine);
}