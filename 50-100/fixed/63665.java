public double fetchTps(int time) {
    int target = (((tickCount) - 1) - time) % (ticks.length);
    long elapsed = (java.lang.System.currentTimeMillis()) - (ticks[java.lang.Math.abs(target)]);
    return time / (elapsed / 1000.0);
}