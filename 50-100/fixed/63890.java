public java.lang.String getFailureCause() throws hudson.AbortException {
    com.sonyericsson.jenkins.plugins.bfa.model.FailureCause fc = org.jenkinsci.plugins.periodicreincarnation.Utils.getFailureCauseById(this.value);
    if (fc == null)
        throw new hudson.AbortException((("Failure Cause with id " + (this.value)) + " does not exist!"));
    
    return fc.getId();
}