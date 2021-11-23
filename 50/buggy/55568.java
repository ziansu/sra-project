@java.lang.Override
protected boolean checkRowGroup(cn.edu.tsinghua.tsfile.timeseries.write.record.TSRecord record) throws cn.edu.tsinghua.tsfile.timeseries.write.exception.WriteProcessException, java.io.IOException {
    if (!(schema.hasDeltaObject(record.deltaObjectId))) {
        schema.addDeltaObject(record.deltaObjectId);
        addGroupToInternalRecordWriter(record);
    }
    return true;
}