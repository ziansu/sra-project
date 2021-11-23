public int getIndexOfCurrentResv(java.util.List<com.google.common.collect.Range<java.lang.Long>> reservedIntervals, long currentTime) {
    int index = 0;
    for (com.google.common.collect.Range<java.lang.Long> interval : reservedIntervals) {
        if (interval.contains(currentTime)) {
            if (reservedIntervals.get((index + 1)).contains(currentTime)) {
                return index + 1;
            }else {
                return index;
            }
        }else {
            index++;
        }
    }
    throw new java.lang.IllegalStateException("No reservation contains the current time!");
}