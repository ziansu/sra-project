@java.lang.Override
public E set(int index, E element) {
    E removed = _impl.set(index, element);
    emitRemove(removed);
    emitAdd(element);
    return removed;
}