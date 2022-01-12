public org.libsmith.anvil.time.TimePeriod addRandom(org.libsmith.anvil.time.TimePeriod origin, org.libsmith.anvil.time.TimePeriod bound) {
    java.util.concurrent.TimeUnit min = ((timeUnit.compareTo(this.getTimeUnit())) < 0) ? timeUnit : this.getTimeUnit();
    return addRandom(origin.getDuration(min), bound.getDuration(min), min);
}