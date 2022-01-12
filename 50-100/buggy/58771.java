private void setJobId(java.lang.String id) {
    this.jobId = id;
    if (((id != null) && (id.startsWith("job_"))) && ((id.length()) > 4)) {
        this.jobNumber = id.substring(4);
    }
}