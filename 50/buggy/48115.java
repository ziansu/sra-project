public java.io.PrintWriter warning(java.lang.String msg) {
    java.io.PrintStream logger = delegate.getLogger();
    logger.println(("WARN: " + msg));
    return new java.io.PrintWriter(logger);
}