public void delActRecord(int date, int primary) {
    com.joyous.goon.TaskData.TasksActRecord.RecordDaily recordDaily = records.get(date);
    if (null == recordDaily) {
        recordDaily = new com.joyous.goon.TaskData.TasksActRecord.RecordDaily();
        recordDaily.record = new java.util.HashSet<>();
    }
    recordDaily.date = date;
    recordDaily.record.remove(primary);
    if (recordDaily.record.isEmpty()) {
        records.remove(date);
        deleteFromDB(resolver, date);
    }else {
        update2DB(resolver, recordDaily);
    }
}