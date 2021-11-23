public hudson.model.Result run(hudson.model.BuildListener listener) throws java.lang.Exception {
    java.io.PrintStream logger = new java.io.PrintStream(listener.getLogger());
    logger.print(log);
    hudson.model.Result r = (result == 0) ? Result.SUCCESS : Result.FAILURE;
    return r;
}