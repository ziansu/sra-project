@java.lang.Override
public E remove(E obj) {
    if ((currentSize) != 0) {
        for (int i = 0; i < (currentSize); i++) {
            if ((((java.lang.Comparable<E>) (obj)).compareTo(array[i])) == 0) {
                E temp = array[i];
                (currentSize)--;
                dynamicResize(false);
                shiftElements(i, false);
                return temp;
            }
        }
    }
    return null;
}