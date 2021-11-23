@java.lang.Override
public java.util.Iterator<T> iterator() {
    return new br.com.zbra.androidlinq.ArrayStream.ArrayIterator<>(source, 0, ((source.length) - 1));
}