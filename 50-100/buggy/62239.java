public boolean UpdateNextProcessDate(int id, java.lang.String nextprocess) {
    try {
        int response = dbConnection.insert(((("update    StoredAttendenceFile set  next_process_date='" + nextprocess) + "',is_processed=1 where  id=") + id));
        if (response == 0) {
            return false;
        }else {
            return true;
        }
    } catch (java.lang.Exception exception) {
        return false;
    }
}