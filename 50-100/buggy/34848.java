private void tick() {
    final double instantRate = (count) / (cc.blynk.server.stats.metrics.InstanceLoadMeter.TICK_INTERVAL_DOUBLE);
    if (initialized) {
        rate += (alpha) * (instantRate - (rate));
    }else {
        rate = instantRate;
        initialized = true;
    }
}