@java.lang.Override
public boolean remove(java.lang.Object o) {
    java.lang.Object[] arr2 = new java.lang.Object[(arr.length) - 1];
    for (int x = 0; x < (arr.length); x++) {
        if ((arr[x]) != o) {
            arr2[x] = arr[x];
        }
    }
    arr = arr2;
    return true;
}