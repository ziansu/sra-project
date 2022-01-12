@java.lang.Override
public java.util.Spliterator<java.lang.Integer> end(long number) {
    return new com.aol.cyclops2.internal.stream.spliterators.ReversingRangeIntSpliterator(start, ((start) + ((int) (number))), reverse);
}