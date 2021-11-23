@java.lang.Override
public void remove(int index) throws java.lang.IndexOutOfBoundsException {
    if (checkIndex(index, size())) {
        for (int i = index; i < (size); i++) {
            values[i] = values[(i + 1)];
        }
        (size)--;
    }else {
        throw new java.lang.IndexOutOfBoundsException();
    }
}