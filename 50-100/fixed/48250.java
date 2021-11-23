public synchronized void writeAppendLogs(int startIndex, int endIndex) {
    for (int i = startIndex; i < endIndex; ++i)
        logFile.printf("APPEND Term: %d, Index: %d, Value: %d, Leader: %d\n", logs.get(i).getTerm(), i, logs.get(i).getIns().getValue(), leaderID);
    
    logFile.flush();
    return ;
}