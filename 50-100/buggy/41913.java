public void setJobID(org.apache.flink.api.common.JobID jobID) {
    gg.CFLManager.LOG.info((("GGG CFLManager.setJobID to '" + jobID) + "'"));
    if (((this.jobID) != null) && (!(this.jobID.equals(jobID)))) {
        throw new java.lang.RuntimeException((((("GGG Csak egy job futhat egyszerre. (old: " + (this.jobID)) + ", new: ") + jobID) + ")"));
    }
    this.jobID = jobID;
}