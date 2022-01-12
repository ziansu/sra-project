@java.lang.Override
public void remove(int index) throws java.lang.IndexOutOfBoundsException {
    if (checkIndex(index, size())) {
        for (int i = 0; i < index; i++) {
            values[index] = values[(index + 1)];
        }
        (size)--;
    }else {
        throw new java.lang.IndexOutOfBoundsException();
    }
}