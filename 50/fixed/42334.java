@java.lang.Override
public boolean removeAll(java.util.Collection<?> collection) {
    if (collection != null) {
        for (java.lang.Object item : collection) {
            remove(item);
        }
    }
    return true;
}