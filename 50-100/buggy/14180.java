@java.lang.Override
public boolean containsAll(java.util.Collection<?> c) {
    if (org.cliffc.high_scale_lib.NonBlockingSetInt.class.equals(c.getClass())) {
        for (final org.cliffc.high_scale_lib.IntIterator it = ((org.cliffc.high_scale_lib.NonBlockingSetInt) (c)).intIterator(); it.hasNext();) {
            if (!(contains(it.next()))) {
                return false;
            }
        }
        return true;
    }
    return super.containsAll(c);
}