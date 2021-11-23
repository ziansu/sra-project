private java.lang.ProcessBuilder setupProcessBuilder() {
    java.lang.ProcessBuilder pb = new java.lang.ProcessBuilder(cmd.getCmdLine());
    pb.environment().putAll(environment);
    pb = pb.directory(dir);
    return pb;
}