@java.lang.Override
public void run(final io.dropwizard.setup.Bootstrap<?> bootstrap, final net.sourceforge.argparse4j.inf.Namespace namespace) throws java.lang.Exception {
    io.paradoxical.cassandra.loader.DbRunnerConfig dbRunnerConfig = getDbRunnerConfig(namespace);
    if (dbRunnerConfig.getRecreateDatabase()) {
        io.paradoxical.cassieq.commands.SetupDbCommand.recreateDatabase(dbRunnerConfig);
    }
    io.paradoxical.cassandra.loader.DbScriptsRunner dbScriptsRunner = new io.paradoxical.cassandra.loader.DbScriptsRunner(dbRunnerConfig);
    dbScriptsRunner.run();
}