public static <T> void checkCompleted(java.util.concurrent.CompletionStage<T> stage) {
    if (!(stage.toCompletableFuture().isDone())) {
        throw new java.lang.IllegalStateException("future was not completed");
    }
}