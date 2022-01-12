private void init(final boolean daemonize, final boolean quiet, org.elasticsearch.env.Environment env) throws org.elasticsearch.cli.UserException, org.elasticsearch.node.NodeValidationException {
    try {
        org.elasticsearch.bootstrap.BootstrapProxy.init((!daemonize), quiet, env);
    } catch (io.crate.bootstrap.BootstrapException | java.lang.RuntimeException e) {
        throw new org.elasticsearch.bootstrap.StartupExceptionProxy(e);
    }
}