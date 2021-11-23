@java.lang.Override
public T next() {
    T item = storage[(--(current))];
    return item;
}