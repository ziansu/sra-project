private void removeRecord(T oldRecord, java.lang.String oldkey) {
    org.kisst.pko4j.index.MultiIndex.logger.info("removing unique key {} ", oldkey);
    org.kisst.item4j.ImmutableSequence<T> oldList = map.get(oldkey);
    org.kisst.item4j.ImmutableSequence<T> newList = oldList.removeItem(oldRecord);
    if ((newList.size()) != (oldList.size()))
        map.put(oldkey, newList);
    
}