@java.lang.Override
public void push(T item) {
    if ((N) == (items.length)) {
        resize(((items.length) << 1));
    }
    items[((N)++)] = item;
}