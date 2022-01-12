@java.lang.Override
public void consume(java.util.List<com.google.gerrit.extensions.common.ChangeInfo> changeInfos) {
    if ((changeInfos != null) && (!(changeInfos.isEmpty()))) {
        com.google.gerrit.extensions.common.ChangeInfo lastChangeInfo = com.google.common.collect.Iterables.getLast(changeInfos);
        hasMore = ((lastChangeInfo._moreChanges) != null) && (lastChangeInfo._moreChanges);
        sortkey = lastChangeInfo._sortkey;
        changes.addAll(changeInfos);
        consumer.consume(changeInfos);
    }else {
        hasMore = false;
    }
    lock.unlock();
}