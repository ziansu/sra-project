public io.reactivex.Completable close(final com.dukascopy.api.IOrder order, final double amount) {
    return completable(() -> order.close(amount));
}