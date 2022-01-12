private void init(final boolean daemonize, final java.nio.file.Path pidFile, final boolean quiet, org.elasticsearch.env.Environment env) throws org.elasticsearch.cli.UserException, org.elasticsearch.node.NodeValidationException {
    try {
        org.elasticsearch.bootstrap.BootstrapProxy.init((!daemonize), pidFile, quiet, env);
    } catch (io.crate.bootstrap.BootstrapException | java.lang.RuntimeException e) {
        throw new org.elasticsearch.bootstrap.StartupExceptionProxy(e);
    }
}