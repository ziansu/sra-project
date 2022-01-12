@java.lang.Override
public void cleanup(long time) {
    java.util.List<java.lang.Long> startTimes = new java.util.ArrayList<java.lang.Long>(m_reports.keySet());
    for (long startTime : startTimes) {
        if (startTime <= time) {
            m_reports.remove(startTime);
        }
    }
}