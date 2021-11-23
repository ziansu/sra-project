public long insertOrReplaceAbsenceRecord(com.unique.countsystem.Record record, com.unique.countsystem.Student student) {
    student.getAbsenceRecords().add(record);
    return mRecordDao.insertOrReplace(record);
}