public void closeConnection() throws org.apache.maven.wagon.ConnectionException {
    log.debug("Invoked closeConnection()");
    try {
        git.pushAll();
        if (safeCheckout)
            org.codehaus.plexus.util.FileUtils.cleanDirectory(git.workDir);
        
    } catch (java.lang.Exception e) {
        throw new org.apache.maven.wagon.ConnectionException(("Unable to push git repostory: " + (e.getMessage())), e);
    }
}