@java.lang.Override
public com.kenny.kellog.model.LogObject nextElement() {
    com.kenny.kellog.model.LogObject log = null;
    if (hasMoreElements()) {
        log = logList.get(index);
        (index)++;
    }
    return log;
}