@java.lang.Override
public boolean hasNext() {
    if (((batchIterator_) != null) && (batchIterator_.hasNext())) {
        return true;
    }
    if (exhausted_) {
        return false;
    }else {
        updateCurrentBatch();
        return ((batchIterator_) != null) && (batchIterator_.hasNext());
    }
}