public void delete(K key, V value) {
    if (kvStore.containsKey(key)) {
        LFUCacheEntry<K, V> entry = kvStore.remove(key);
        FrequencyNode frequencyNode = entry.frequencyNode;
        frequencyNode.lfuCacheEntryList.remove(entry);
        if ((frequencyNode.lfuCacheEntryList.length) == 0) {
            frequencyMap.remove(frequencyNode.frequency);
            freqList.remove(frequencyNode);
        }
    }
}