public void transform(long timestamp) {
    super.store("promoted", timestamp, getOriginVal("promoted"), 1L);
    super.store("survived", timestamp, getOriginVal("survived"), 1L);
    super.store("timelimitexceeded", timestamp, getDeltaVal("timelimitexceeded"), 0L);
    super.store("survivoroverflowed", timestamp, getDeltaVal("survivoroverflowed"), 0L);
    super.commit();
}