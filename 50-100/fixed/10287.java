public java.lang.Object remove(int index) {
    ensureIndex(index);
    java.lang.Object temp = elementData[index];
    java.lang.System.arraycopy(elementData, (index + 1), elementData, index, (((size) - index) - 1));
    elementData[((size) - 1)] = null;
    (size)--;
    return temp;
}