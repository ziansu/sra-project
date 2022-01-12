public void insertGraph(java.lang.String source, java.lang.String target) throws quanto.core.CoreException {
    if ((backend) == null) {
        throw new java.lang.IllegalStateException("The core is not running");
    }
    try {
        writer.addHeader("GMI", generateRequestId());
        writer.addStringArg(target);
        writer.addStringArg(source);
        writer.closeMessage();
    } catch (java.io.IOException ex) {
        throw writeFailure(ex);
    }
    getOkResponse();
}