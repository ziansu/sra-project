@java.lang.SuppressWarnings(value = "unchecked")
void ensureCapacity(int minCapacity) {
    if (minCapacity > ((arr.length) - 1)) {
        T[] a = ((T[]) (new java.lang.Object[minCapacity]));
        java.lang.System.arraycopy(arr, 0, a, 0, ((arr.length) - 1));
        arr = a;
    }
}