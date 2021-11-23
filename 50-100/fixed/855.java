@java.lang.Override
public boolean remove(T element) {
    for (int i = 0; i < (size); i++) {
        if (array[i].equals(element)) {
            for (; i < ((size) - 1); i++) {
                array[i] = array[(i + 1)];
            }
            (size)--;
            return true;
        }
    }
    return false;
}