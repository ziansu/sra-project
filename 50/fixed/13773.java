@java.lang.Override
public java.lang.Object next() {
    java.lang.Object obj = iter.next();
    return obj == null ? null : ((java.lang.ref.WeakReference) (obj)).get();
}