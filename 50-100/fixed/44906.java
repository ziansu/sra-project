private void search() {
    if ((pred) == null) {
        return ;
    }
    while (((ridRecordNumber(nextRid)) < (numOfRecords)) && (!(pred.test(getRecord(nextRid))))) {
        nextRid = nextRid(nextRid);
    } 
}