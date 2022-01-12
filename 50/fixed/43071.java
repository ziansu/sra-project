@com.hazelcast.simulator.test.annotations.Warmup(global = true)
public void warmup() throws java.lang.Exception {
    for (int i = 0; i < (keyCount); i++) {
        cache.put(i, 0L);
    }
}