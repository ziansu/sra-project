public V remove(int idx) {
    V value = elements[idx];
    java.lang.System.arraycopy(elements, (idx + 1), elements, idx, (((size) - idx) - 1));
    elements[((size) - 1)] = null;
    (size)--;
    return value;
}