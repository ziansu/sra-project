public static void checkCompleted(java.util.concurrent.CompletionStage<?> stage) {
    if (!(stage.toCompletableFuture().isDone())) {
        throw new java.lang.IllegalStateException("future was not completed");
    }
}