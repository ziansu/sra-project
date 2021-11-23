public E remove(int index) {
    Collection.Concrete.ArrayList.checkIndex(index);
    if (index == ((size) - 1)) {
        return removeLast();
    }
    E result = elements[index];
    synchronized(this) {
        java.lang.System.arraycopy(elements, (index + 1), elements, index, (((size) - index) - 1));
        (size)--;
    }
    return result;
}