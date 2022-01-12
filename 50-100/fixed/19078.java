private void removeRecord(java.lang.String key, T oldRecord) {
    org.kisst.pko4j.index.MultiIndex.logger.info("removing unique key {} ", key);
    org.kisst.item4j.ImmutableSequence<T> oldList = map.get(key);
    org.kisst.item4j.ImmutableSequence<T> newList = oldList.removeItem(oldRecord);
    if ((newList.size()) != (oldList.size()))
        map.put(key, newList);
    
}