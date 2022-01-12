public java.util.Date getStartTime() {
    org.unidal.cat.spi.ReportPeriod period = getReportPeriod();
    java.util.Date startTime;
    if ((m_startTime) <= 0) {
        startTime = period.getStartTime(new java.util.Date());
    }else {
        java.util.Date time = getDate(period, m_startTime, m_step);
        startTime = period.getStartTime(time);
    }
    if (startTime.after(new java.util.Date())) {
        return period.getStartTime(new java.util.Date());
    }else {
        return startTime;
    }
}