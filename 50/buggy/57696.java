@java.lang.Override
public T next() {
    if ((nextRecord) == null) {
        hasNext = null;
        return getObject();
    }else {
        T nextRecordRef = nextRecord;
        nextRecord = null;
        return nextRecordRef;
    }
}