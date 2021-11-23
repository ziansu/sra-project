@javax.annotation.Nonnull
protected <T, R> com.hazelcast.jet.AbstractProcessor.FlatMapper<T, R> flatMapper(int outputOrdinal, @javax.annotation.Nonnull
java.util.function.Function<? super T, ? extends com.hazelcast.jet.Traverser<? extends R>> mapper) {
    return new com.hazelcast.jet.AbstractProcessor.FlatMapper(outputOrdinal, mapper);
}