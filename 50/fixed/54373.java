private void grow() {
    int newCapacity = ((elementData.length) * 3) / 2;
    elementData = java.util.Arrays.copyOf(elementData, newCapacity);
}