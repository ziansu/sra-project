public void emptyDataBase(java.lang.String event) {
    mDatabase.child(DB_ID).child(mUserId).child(event).setValue(null);
    log("try to nullify firebase");
}