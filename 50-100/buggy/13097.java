@java.lang.Override
public boolean addAll(java.util.Collection<? extends java.lang.Integer> c) {
    if (org.cliffc.high_scale_lib.NonBlockingSetInt.class.equals(c.getClass())) {
        boolean modified = false;
        for (final org.cliffc.high_scale_lib.IntIterator it = ((org.cliffc.high_scale_lib.NonBlockingSetInt) (c)).intIterator(); it.hasNext();) {
            modified |= add(it.next());
        }
        return modified;
    }
    return super.addAll(c);
}