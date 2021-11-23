public long getTime(org.yamj.filescanner.model.TimeType timeType) {
    if (times.containsKey(timeType)) {
        return times.get(timeType);
    }
    return 0L;
}