@java.lang.Override
public void onNext(T value) {
    int i = tailIndex;
    java.lang.Object[] a = tail;
    if (i == ((a.length) - 1)) {
        java.lang.Object[] b = new java.lang.Object[a.length];
        b[0] = value;
        tailIndex = 1;
        a[i] = b;
        tail = b;
    }else {
        a[i] = value;
        tailIndex = i + 1;
    }
    (size)++;
}