private static gnu.trove.map.TIntIntMap translatePartitioningFromZNBased(gnu.trove.map.TIntIntMap zNBasedPartitioning, gnu.trove.map.TIntIntMap reverseUidMap, gnu.trove.map.TIntIntMap reversePidMap) {
    gnu.trove.map.TIntIntMap translatedPartitioning = new gnu.trove.map.hash.TIntIntHashMap();
    for (int i : zNBasedPartitioning.keys()) {
        int rawPid = zNBasedPartitioning.get(i);
        int translatedUid = reverseUidMap.get(i);
        int translatedPid = reversePidMap.get(rawPid);
        translatedPartitioning.put(translatedUid, translatedPid);
    }
    return translatedPartitioning;
}