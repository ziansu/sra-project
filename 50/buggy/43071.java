@com.hazelcast.simulator.test.annotations.Warmup(global = true)
public void warmup() throws java.lang.Exception {
    for (int k = 0; k < (keyCount); k++) {
        cache.put(k, 0L);
    }
}