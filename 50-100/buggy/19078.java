private void removeRecord(java.lang.String oldkey, T oldRecord) {
    org.kisst.pko4j.index.MultiIndex.logger.info("removing unique key {} ", oldkey);
    org.kisst.item4j.ImmutableSequence<T> oldList = map.get(oldkey);
    org.kisst.item4j.ImmutableSequence<T> newList = oldList.removeItem(oldRecord);
    if ((newList.size()) != (oldList.size()))
        map.put(oldkey, newList);
    
}