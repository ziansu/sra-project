@java.lang.Override
public boolean removeAll(java.util.Collection<?> c) {
    if (org.cliffc.high_scale_lib.NonBlockingSetInt.class.equals(c.getClass())) {
        boolean modified = false;
        for (final org.cliffc.high_scale_lib.IntIterator it = ((org.cliffc.high_scale_lib.NonBlockingSetInt) (c)).intIterator(); it.hasNext();) {
            modified |= remove(it.next());
        }
        return modified;
    }
    return super.removeAll(c);
}