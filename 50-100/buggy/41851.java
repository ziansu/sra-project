public boolean addTupleLock(Scheduler.Type type, int TID, data.IDNumber id, java.lang.String TableName, data.AreaCode area_code) {
    Scheduler.Scheduler.Lock l = new Scheduler.Scheduler.Lock(type, 0, TID, id, TableName, area_code);
    l.WaitforT = getLatestWaitfor(l);
    if (l.WaitforT.isEmpty()) {
        LockTable.add(l);
        return true;
    }else {
        return false;
    }
}