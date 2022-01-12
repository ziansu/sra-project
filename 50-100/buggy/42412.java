private void addRecord(T newRecord, java.lang.String newkey) {
    org.kisst.pko4j.index.MultiIndex.logger.info("adding unique key {} ", newkey);
    org.kisst.item4j.ImmutableSequence<T> oldList = map.get(newkey);
    if (oldList == null)
        map.put(newkey, org.kisst.item4j.ImmutableSequence.of(getRecordClass(), newRecord));
    else
        if (!(oldList.contains(newRecord))) {
            org.kisst.item4j.ImmutableSequence<T> newList = oldList.growTail(newRecord);
            map.put(newkey, newList);
        }
    
}