public double fetchTps(int time) {
    int target = (((tickCount) - 1) - time) % (ticks.length);
    long elapsed = (java.lang.System.currentTimeMillis()) - (ticks[target]);
    return time / (elapsed / 1000.0);
}