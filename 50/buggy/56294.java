public synchronized void appendLog(java.lang.String log) {
    if ((txtLog.getLineCount()) > 300) {
        txtLog.getText().substring(1000);
    }
    txtLog.append(log);
    java.lang.System.out.print(log);
}