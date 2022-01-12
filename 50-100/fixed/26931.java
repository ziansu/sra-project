public static int[] generateIntKeys(int keyCount, int keyMaxValue, com.hazelcast.simulator.tests.helpers.KeyLocality keyLocality, com.hazelcast.core.HazelcastInstance instance) {
    int[] keys = new int[keyCount];
    for (int i = 0; i < (keys.length); i++) {
        keys[i] = com.hazelcast.simulator.tests.helpers.KeyUtils.generateIntKey(keyMaxValue, keyLocality, instance);
    }
    return keys;
}