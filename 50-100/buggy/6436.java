public final hu.akarnokd.rxjava2.basetypes.Solo<T> doOnNext(hu.akarnokd.rxjava2.basetypes.Consumer<? super T> onNext) {
    hu.akarnokd.rxjava2.basetypes.ObjectHelper.requireNonNull(onNext, "onNext is null");
    return hu.akarnokd.rxjava2.basetypes.Solo.onAssembly(new hu.akarnokd.rxjava2.basetypes.SoloDoOnLifecycle<T>(this, onNext, hu.akarnokd.rxjava2.basetypes.Functions.emptyConsumer(), Functions.ERROR_CONSUMER, Functions.EMPTY_ACTION, Functions.EMPTY_ACTION, hu.akarnokd.rxjava2.basetypes.Functions.emptyConsumer(), Functions.EMPTY_LONG_CONSUMER, Functions.EMPTY_ACTION));
}