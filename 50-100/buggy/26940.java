public java.util.Date getStartTime() {
    org.unidal.cat.spi.ReportPeriod period = getReportPeriod();
    if ((m_startTime) <= 0) {
        m_startTime = java.lang.System.currentTimeMillis();
    }
    java.util.Date time = getDate(period, m_startTime, m_step);
    java.util.Date startTime = period.getStartTime(time);
    if (startTime.after(new java.util.Date())) {
        return period.getStartTime(new java.util.Date());
    }else {
        return startTime;
    }
}