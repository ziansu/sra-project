public io.reactivex.Completable close(final com.dukascopy.api.IOrder order, final double amount, final double price, final double slippage) {
    return completable(() -> order.close(amount, price, slippage));
}