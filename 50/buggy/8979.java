@java.lang.Override
public T set(int index, T element) {
    if ((index < (-1)) || (index >= (size))) {
        throw new java.lang.IndexOutOfBoundsException();
    }
    dataArray[index] = element;
    return element;
}