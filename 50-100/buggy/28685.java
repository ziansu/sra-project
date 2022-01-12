private static gnu.trove.map.TIntIntMap getReversePidMap(gnu.trove.set.TIntSet pids) {
    int[] sortedPids = pids.toArray();
    java.util.Arrays.sort(sortedPids);
    gnu.trove.map.TIntIntMap reversePidMap = new gnu.trove.map.hash.TIntIntHashMap(((pids.size()) + 1));
    int count = 0;
    for (int i = 0; i < (sortedPids.length); i++) {
        reversePidMap.put(count, sortedPids[i]);
    }
    return reversePidMap;
}