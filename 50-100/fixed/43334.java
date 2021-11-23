@java.lang.Override
public void forEachRemaining(java.util.function.Consumer<? super T> action) {
    final java.util.function.Consumer<? super IN> toUse = com.aol.cyclops2.internal.stream.spliterators.DistinctKeySpliterator.apply(action);
    source.forEachRemaining(( e) -> {
        if (values.add(keyExtractor.apply(e))) {
            toUse.accept(e);
        }
    });
}