@java.lang.Override
public boolean complete() {
    org.hazelcast.jet.samples.windowing.TradeEvent ev = new org.hazelcast.jet.samples.windowing.TradeEvent("HZ", 1, ((val)++), java.lang.System.currentTimeMillis());
    emit(ev);
    try {
        java.lang.Thread.sleep(500);
    } catch (java.lang.InterruptedException e) {
        return false;
    }
    return false;
}