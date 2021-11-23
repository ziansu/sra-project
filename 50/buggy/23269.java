@java.lang.Override
protected java.util.List<org.araqne.logstorage.Log> filter(java.util.List<org.araqne.logstorage.Log> logs) {
    count += logs.size();
    tabletTask.setActualCount(count);
    return logs;
}