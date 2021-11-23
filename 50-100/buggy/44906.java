private void search() {
    if ((pred) == null) {
        return ;
    }
    while (!(pred.test(getRecord(nextRid)))) {
        nextRid = nextRid(nextRid);
        if ((ridRecordNumber(nextRid)) >= (numOfRecords)) {
            return ;
        }
    } 
}