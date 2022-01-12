private boolean updateIterationState(org.rundeck.api.domain.RundeckOutput rundeckOutput) {
    offset = rundeckOutput.getOffset();
    lastmod = defaultLong(rundeckOutput.getLastModified(), 0L);
    boolean c = java.lang.Boolean.TRUE.equals(rundeckOutput.isCompleted());
    org.jenkinsci.plugins.rundeck.RunDeckLogTail.log.log(java.util.logging.Level.FINE, "Offset is now set to [{0}], lastmod is now set to [{1}], completed is now set to [{2}]", new java.lang.Object[]{ offset , lastmod , c });
    return c;
}