private void addRecord(java.lang.String key, T newRecord) {
    org.kisst.pko4j.index.MultiIndex.logger.info("adding unique key {} ", key);
    org.kisst.item4j.ImmutableSequence<T> oldList = map.get(key);
    if (oldList == null)
        map.put(key, org.kisst.item4j.ImmutableSequence.of(getRecordClass(), newRecord));
    else
        if (!(oldList.contains(newRecord))) {
            org.kisst.item4j.ImmutableSequence<T> newList = oldList.growTail(newRecord);
            map.put(key, newList);
        }
    
}