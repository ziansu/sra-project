public org.easybatch.core.job.JobReportFormatter<java.lang.String> getFormatter() {
    if ((this.formatter) == null) {
        synchronized(this) {
            if ((this.formatter) == null) {
                this.formatter = new org.easybatch.core.job.DefaultJobReportFormatter();
            }
        }
    }
    return this.formatter;
}