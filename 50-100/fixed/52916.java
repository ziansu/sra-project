@java.lang.Override
public void add(int index, T element) {
    if ((index < 0) || (index > (size))) {
        throw new java.lang.IndexOutOfBoundsException();
    }
    ensureCapacity(((size) + 1));
    java.lang.System.arraycopy(dataArray, index, dataArray, (index + 1), ((size) - index));
    dataArray[index] = element;
    (size)++;
}