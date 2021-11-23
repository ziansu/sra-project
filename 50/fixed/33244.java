public com.datafibers.model.DFJobPOPJ setFlinkIDToJobConfig(java.lang.String jobID) {
    if ((this.jobConfig) == null)
        this.jobConfig = new java.util.HashMap<>();
    
    this.jobConfig.put(ConstantApp.PK_FLINK_SUBMIT_JOB_ID, jobID);
    return this;
}