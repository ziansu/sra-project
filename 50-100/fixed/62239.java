public boolean UpdateNextProcessDate(int id, java.lang.String nextprocess) {
    try {
        int response = dbConnection.insert(((("update    StoredAttendenceFile set  next_process_date='" + nextprocess) + "',is_processed=1 where  id=") + id));
        return response != 0;
    } catch (java.lang.Exception exception) {
        return false;
    }
}