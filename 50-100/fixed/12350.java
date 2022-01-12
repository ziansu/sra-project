public org.libsmith.anvil.time.TimePeriod addRandom(org.libsmith.anvil.time.TimePeriod origin, org.libsmith.anvil.time.TimePeriod bound) {
    java.util.concurrent.TimeUnit min = org.libsmith.anvil.time.TimePeriod.min(origin.getTimeUnit(), bound.getTimeUnit());
    return addRandom(origin.getDuration(min), bound.getDuration(min), min);
}