@java.lang.Override
public java.util.Spliterator<java.lang.Long> end(long num) {
    return new com.aol.cyclops2.internal.stream.spliterators.ReversingRangeLongSpliterator(min, ((min) + num), reverse);
}