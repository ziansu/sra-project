private void executeInThread(final java.lang.String query) {
    executorService.execute(() -> {
        org.neo4j.graphdb.Result execute = db.execute(query);
        try {
            execute.resultAsString();
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            hasFailed.set(true);
        }
    });
}