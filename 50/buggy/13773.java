@java.lang.Override
public java.lang.Object next() {
    return (iter.next()) == null ? null : ((java.lang.ref.WeakReference) (iter.next())).get();
}