@java.lang.Override
public boolean contains(E obj) {
    if (!(isEmpty())) {
        for (int i = 0; i < (currentSize); i++) {
            if ((((java.lang.Comparable<E>) (obj)).compareTo(array[i])) == 0) {
                return true;
            }
        }
    }
    return false;
}