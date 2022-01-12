@java.lang.Override
public E next() {
    return ((E) ((java.lang.Number) (dataset.get(((index)++), attr))));
}