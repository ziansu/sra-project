public static java.lang.String[] generateStringKeys(int keyCount, int keyLength, com.hazelcast.simulator.tests.helpers.KeyLocality keyLocality, com.hazelcast.core.HazelcastInstance instance) {
    java.lang.String[] keys = new java.lang.String[keyCount];
    for (int i = 0; i < (keys.length); i++) {
        keys[i] = com.hazelcast.simulator.tests.helpers.KeyUtils.generateStringKey(keyLength, keyLocality, instance);
    }
    return keys;
}