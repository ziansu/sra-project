@java.lang.Override
public <U> U reduce(U identity, final java.util.function.BiFunction<U, ? super T, U> accumulator, java.util.function.BinaryOperator<U> combiner) {
    final java.util.stream.Stream.ValueConsumer<U> consumer = new java.util.stream.Stream.ValueConsumer<U>();
    spliterator.forEachRemaining(( item) -> consumer.accept(accumulator.apply(consumer.value, item)));
    return consumer.value;
}