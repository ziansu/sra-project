public java.lang.Object remove(int index) {
    ensureIndex(index);
    java.lang.Object temp = elementData[index];
    java.lang.System.arraycopy(elementData, (index + 1), elementData, index, ((size) - index));
    (size)--;
    return temp;
}