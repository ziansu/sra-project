@java.lang.Override
public int locate(E obj) {
    if ((currentSize) != 0) {
        for (int i = 0; i < (currentSize); i++) {
            if ((((java.lang.Comparable<E>) (obj)).compareTo(array[i])) == 0) {
                return i + 1;
            }
        }
    }
    return -1;
}