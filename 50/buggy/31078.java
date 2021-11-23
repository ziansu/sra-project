public synchronized void writeDeleteLogs(int startIndex, int endIndex) {
    java.lang.System.out.println("I am writing to delete log...");
    logFile.printf("DELETE IndexFrom: %d, IndexUntil: %d, Leader: %d\n", startIndex, endIndex, leaderID);
    logFile.flush();
    return ;
}