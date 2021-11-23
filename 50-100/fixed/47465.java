@java.lang.Override
public void before() throws java.lang.Throwable {
    ai.grakn.test.GraknTestEnv.hideLogs();
    if (startKafka) {
        ai.grakn.test.GraknTestEnv.startKafka();
    }
    if (startDistributedEngine) {
        ai.grakn.test.GraknTestEnv.startEngine(true);
    }
    if (startInMemoryEngine) {
        ai.grakn.test.GraknTestEnv.startEngine(false);
    }
}