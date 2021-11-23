private void closeColumns(boolean truncate) {
    for (int i = 0, n = columns.size(); i < n; i++) {
        com.questdb.cairo.AppendMemory m = columns.getQuick(i);
        if (m != null) {
            m.close(truncate);
        }
    }
}