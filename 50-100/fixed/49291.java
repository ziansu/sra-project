@java.lang.Override
public long refill(long limit) {
    final long now = org.apache.hadoop.hbase.util.EnvironmentEdgeManager.currentTime();
    if ((nextRefillTime) == (-1)) {
        nextRefillTime = org.apache.hadoop.hbase.util.EnvironmentEdgeManager.currentTime();
        return limit;
    }
    long delta = (limit * (now - (nextRefillTime))) / (super.getTimeUnitInMillis());
    if (delta > 0) {
        this.nextRefillTime = now;
        return java.lang.Math.min(limit, delta);
    }
    return 0;
}