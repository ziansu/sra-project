@java.lang.Override
public com.dattack.dbtools.ping.LogEntry build() {
    if ((totalTime) == (com.dattack.dbtools.ping.LogEntry.LogEntryBuilder.UNKNOWN)) {
        this.totalTime = computeRelativeTime();
    }
    if (((exception) == null) && ((firstRowTime) == (com.dattack.dbtools.ping.LogEntry.LogEntryBuilder.UNKNOWN))) {
        this.firstRowTime = totalTime;
    }
    com.dattack.dbtools.ping.LogEntry logEntry = new com.dattack.dbtools.ping.LogEntry(this);
    init();
    return logEntry;
}