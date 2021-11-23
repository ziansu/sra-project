@java.lang.Override
public void updateRecord(final long recNo, final java.lang.String[] data, final long lockCookie) throws java.lang.SecurityException, suncertify.db.RecordNotFoundException {
    cookie = lockRecord(recNo);
    cache.updateRecord(recNo, data[ownerIndex]);
    if ((cookie) == lockCookie) {
        unlock(recNo, lockCookie);
    }else {
        throw new java.lang.SecurityException("Incorrect cookie to unlock and update record");
    }
}