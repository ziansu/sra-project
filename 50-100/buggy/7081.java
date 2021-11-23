@java.lang.Override
protected void run(final io.dropwizard.setup.Bootstrap<io.paradoxical.cassieq.ServiceConfiguration> bootstrap, final net.sourceforge.argparse4j.inf.Namespace namespace, final io.paradoxical.cassieq.ServiceConfiguration configuration) throws java.lang.Exception {
    io.paradoxical.cassandra.loader.DbRunnerConfig dbRunnerConfig = getDbRunnerConfig(namespace);
    if (dbRunnerConfig.getRecreateDatabase()) {
        io.paradoxical.cassieq.commands.SetupDbCommand.recreateDatabase(dbRunnerConfig);
    }
    io.paradoxical.cassandra.loader.DbScriptsRunner dbScriptsRunner = new io.paradoxical.cassandra.loader.DbScriptsRunner(dbRunnerConfig);
    dbScriptsRunner.run();
}