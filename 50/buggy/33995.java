public io.reactivex.Completable close(final com.dukascopy.api.IOrder order, final double amount) {
    com.jforex.programming.order.task.TaskExecutor.logger.info("Called normal close");
    return completable(() -> order.close(amount));
}