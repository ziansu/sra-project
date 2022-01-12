@java.lang.Override
public boolean add(E e) {
    java.lang.Object[] arr2 = new java.lang.Object[(arr.length) + 1];
    for (int x = 0; x < (arr.length); x++) {
        arr2[x] = arr[x];
    }
    arr2[arr.length] = e;
    return true;
}