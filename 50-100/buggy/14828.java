public void waitToFinish() {
    flush();
    futures.forEach(( f) -> {
        try {
            f.get();
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e) {
            ai.grakn.client.BatchMutatorClient.LOG.error("Error while waiting for termination", e);
            printError(e.getMessage());
        }
    });
    futures.clear();
    java.lang.System.out.println("All tasks completed");
}