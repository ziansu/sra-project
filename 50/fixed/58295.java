public boolean noMoodLogs() {
    dbMoodLog.openRead();
    boolean check = (dbMoodLog.getCountMoodLogs()) == 0;
    dbMoodLog.close();
    return check;
}