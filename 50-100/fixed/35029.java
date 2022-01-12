@java.lang.Override
public boolean remove(java.lang.Object o) {
    java.lang.Object[] arr2 = new java.lang.Object[(arr.length) - 1];
    int count = 0;
    for (int x = 0; x < (arr.length); x++) {
        if (!(arr[x].equals(o))) {
            arr2[count] = arr[x];
            count++;
        }
    }
    arr = arr2;
    return true;
}