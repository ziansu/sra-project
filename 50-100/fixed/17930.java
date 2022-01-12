public E remove(int index) {
    Collection.Concrete.ArrayList.checkIndex(index);
    E result = elements[index];
    java.lang.System.arraycopy(elements, (index + 1), elements, index, (((size) - index) - 1));
    elements[(--(size))] = null;
    return result;
}