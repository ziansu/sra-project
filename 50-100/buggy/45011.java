private com.google.common.util.concurrent.ListenableFuture<java.lang.Void> stopTask(final java.lang.String id, final boolean publish) {
    return com.google.common.util.concurrent.Futures.transform(taskClient.stopAsync(id, publish), new com.google.common.base.Function<java.lang.Boolean, java.lang.Void>() {
        @javax.annotation.Nullable
        @java.lang.Override
        public java.lang.Void apply(@javax.annotation.Nullable
        java.lang.Boolean result) {
            if ((result == null) || (!result)) {
                io.druid.indexing.kafka.supervisor.KafkaSupervisor.log.info("Task [%s] failed to stop in a timely manner, killing task", id);
                killTask(id);
            }
            return null;
        }
    }, workerExec);
}