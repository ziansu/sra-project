@java.lang.Override
public T[] toArray(T[] a) {
    if ((a.length) < 1) {
        a = ((T[]) (java.lang.reflect.Array.newInstance(a.getClass().getComponentType(), 1)));
    }
    a[0] = data;
    if ((a.length) > 1) {
        a[1] = null;
    }
    return a;
}