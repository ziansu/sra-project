public java.io.PrintWriter info(java.lang.String msg) {
    java.io.PrintStream logger = delegate.getLogger();
    logger.println(msg);
    return new java.io.PrintWriter(logger);
}