@java.lang.Override
public T next() {
    return list.get(((index)++));
}