public final void execute() throws org.apache.tools.ant.BuildException {
    try {
        int nbModifiedFiles = doExecute();
        if (nbModifiedFiles == 0) {
            log("Files are already up to date");
        }else {
            log(java.lang.String.format("%d files have been modified", nbModifiedFiles));
        }
    } catch (org.apache.tools.ant.BuildException be) {
        if (failOnError) {
            throw be;
        }else {
            be.printStackTrace();
        }
    } catch (java.lang.Throwable t) {
        if (failOnError) {
            throw new org.apache.tools.ant.BuildException(t);
        }else {
            t.printStackTrace();
        }
    }
}