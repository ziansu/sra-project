@java.lang.Override
public com.orientechnologies.orient.core.record.impl.ODocument fromStream(final byte[] iRecordBuffer) {
    removeAllCollectionChangeListeners();
    _fields = null;
    _fieldSize = 0;
    _contentChanged = false;
    _schema = null;
    fetchSchemaIfCan();
    super.fromStream(iRecordBuffer);
    if (!(_lazyLoad)) {
        checkForLoading();
        checkForFields();
    }
    return this;
}