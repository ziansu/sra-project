@java.lang.Override
public java.util.Iterator<T> iterator() {
    return new br.com.zbra.androidlinq.ArrayStream.ArrayIterator<>(source, 0, 1, source.length);
}