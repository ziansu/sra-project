@java.lang.Override
public final boolean remove(final java.lang.Object object) {
    if (contains(object)) {
        final int index = indexOf(object);
        remove(index);
        callOnItemRemovedListeners(object, index);
        return true;
    }else {
        return false;
    }
}