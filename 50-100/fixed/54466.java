public org.kiteq.commons.monitor.Counter.CounterResult changed() {
    long now = counter.get();
    long change = now - (this.preCount);
    this.preCount = now;
    long times = this.time.get();
    long tchange = times - (this.preTime);
    this.preTime = times;
    org.kiteq.commons.monitor.Counter.CounterResult result = new org.kiteq.commons.monitor.Counter.CounterResult();
    result.changed = change;
    if (change > 0) {
        result.avgCostMilSeconds = tchange / change;
    }
    return result;
}