@java.lang.Override
public void perform(org.spine3.server.BoundedContext context) {
    final org.spine3.server.aggregate.AggregateRepository<?, ?> repository = org.spine3.server.stand.Given.aggregateRepo(context);
    repository.initStorage(org.spine3.server.storage.memory.InMemoryStorageFactory.getInstance());
    try {
        repository.dispatch(org.spine3.server.stand.Given.validCommand());
    } catch (java.lang.IllegalStateException e) {
        if (!(e.getMessage().contains("No record found for command ID: EMPTY"))) {
            throw e;
        }
    }
}