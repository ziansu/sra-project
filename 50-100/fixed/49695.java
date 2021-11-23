@java.lang.Override
public java.lang.Object[] toArray(java.lang.Object[] a) {
    if ((a.length) < (size)) {
        return this.toArray();
    }else {
        int i = 0;
        for (java.lang.Object item : this) {
            a[i] = item;
            i++;
        }
        return a;
    }
}