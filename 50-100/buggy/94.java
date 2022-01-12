public com.alphatica.genotick.timepoint.TimePoint getNextTimePint(com.alphatica.genotick.timepoint.TimePoint now) {
    int index = java.util.Collections.binarySearch(timePoints, now);
    if ((index < 0) || (index > ((timePoints.size()) - 2))) {
        return null;
    }else {
        return timePoints.get((index + 1));
    }
}