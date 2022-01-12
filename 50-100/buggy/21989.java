@java.lang.Override
public T poll() {
    int i = (index)++;
    T[] a = array;
    if (i < (a.length)) {
        T t = a[i];
        if (t == null) {
            throw new java.lang.NullPointerException();
        }
        return t;
    }
    return null;
}