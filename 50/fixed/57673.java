@java.lang.Override
public boolean remove(final java.lang.Object child) {
    final boolean removed = super.remove(child);
    if (removed) {
        sharedObject.setChildModified(removed);
    }
    return removed;
}