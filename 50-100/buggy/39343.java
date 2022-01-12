@java.lang.Override
public boolean hasNext() {
    if (exhausted_) {
        return false;
    }
    if (((batchIterator_) != null) && (batchIterator_.hasNext())) {
        return true;
    }else {
        updateCurrentBatch();
        return !(exhausted_);
    }
}