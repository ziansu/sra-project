public final hu.akarnokd.rxjava2.basetypes.Solo<T> doOnComplete(hu.akarnokd.rxjava2.basetypes.Action onComplete) {
    hu.akarnokd.rxjava2.basetypes.ObjectHelper.requireNonNull(onComplete, "onComplete is null");
    return hu.akarnokd.rxjava2.basetypes.Solo.onAssembly(new hu.akarnokd.rxjava2.basetypes.SoloDoOnLifecycle<T>(this, hu.akarnokd.rxjava2.basetypes.Functions.emptyConsumer(), hu.akarnokd.rxjava2.basetypes.Functions.emptyConsumer(), hu.akarnokd.rxjava2.basetypes.Functions.emptyConsumer(), onComplete, Functions.EMPTY_ACTION, hu.akarnokd.rxjava2.basetypes.Functions.emptyConsumer(), Functions.EMPTY_LONG_CONSUMER, Functions.EMPTY_ACTION));
}