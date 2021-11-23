public long getTriggerTime() {
    return (options.optLong("at", 0)) * 1000;
}