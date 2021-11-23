@java.lang.Override
public T next() {
    hasNext = null;
    if ((nextRecord) == null) {
        return getObject();
    }else {
        T nextRecordRef = nextRecord;
        nextRecord = null;
        return nextRecordRef;
    }
}