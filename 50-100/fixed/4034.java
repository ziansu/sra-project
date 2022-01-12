private java.util.concurrent.CompletableFuture<ru.nsu.ccfit.boltava.model.message.Message> feedQueue(ru.nsu.ccfit.boltava.model.message.Message message, java.lang.Runnable onSuccess, java.lang.Runnable onError, java.lang.Runnable onAny) throws java.lang.InterruptedException {
    if (message == null) {
        throw new java.lang.IllegalArgumentException("Message can't be null");
    }
    java.util.concurrent.CompletableFuture<ru.nsu.ccfit.boltava.model.message.Message> future = new java.util.concurrent.CompletableFuture<>();
    queue.put(new ru.nsu.ccfit.boltava.model.Neighbor.ExecutionPack(message, onSuccess, onError, onAny, future));
    return future;
}