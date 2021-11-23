public java.lang.String getFailureCauseName() throws hudson.AbortException {
    java.util.Collection<java.lang.String> causes = org.jenkinsci.plugins.periodicreincarnation.Utils.getAvailableFailureCausesIds();
    com.sonyericsson.jenkins.plugins.bfa.model.FailureCause fc = org.jenkinsci.plugins.periodicreincarnation.Utils.getFailureCauseById(this.value);
    if (fc == null)
        throw new hudson.AbortException((("Failure Cause with id " + (this.value)) + " does not exist!"));
    
    return fc.getName();
}