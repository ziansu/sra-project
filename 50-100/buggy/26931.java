public static int[] generateIntKeys(int keyCount, int keyMaxValue, com.hazelcast.simulator.tests.helpers.KeyLocality keyLocality, com.hazelcast.core.HazelcastInstance instance) {
    int[] keys = new int[keyCount];
    for (int k = 0; k < (keys.length); k++) {
        keys[k] = com.hazelcast.simulator.tests.helpers.KeyUtils.generateIntKey(keyMaxValue, keyLocality, instance);
    }
    return keys;
}