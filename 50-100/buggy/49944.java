@java.lang.Override
public void cleanup() {
    long currentStartTime = ModelPeriod.CURRENT.getStartTime();
    long threshold = currentStartTime - (2 * (com.dianping.cat.Constants.HOUR));
    java.util.List<java.lang.Long> startTimes = new java.util.ArrayList<java.lang.Long>(m_reports.keySet());
    for (long startTime : startTimes) {
        if (startTime <= threshold) {
            m_reports.remove(startTime);
        }
    }
}