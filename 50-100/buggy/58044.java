private java.lang.String getExport(hudson.util.ArgumentListBuilder args, java.lang.String destFile) throws java.io.IOException, java.lang.InterruptedException {
    java.lang.Integer statusCode = launcher.launch().pwd(build.getWorkspace()).cmds(args).stdout(listener.getLogger()).stderr(listener.getLogger()).join();
    if (statusCode != 0) {
        new hudson.AbortException("Failed to fork bash ");
    }
    return build.getWorkspace().child(destFile).readToString();
}