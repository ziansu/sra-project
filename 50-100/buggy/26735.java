@java.lang.SuppressWarnings(value = "unchecked")
private void cloneData(int newCapacity) {
    com.pdomingo.data_structures.implementations.list.ArrayList.Node<T>[] newArray = ((com.pdomingo.data_structures.implementations.list.ArrayList.Node<T>[]) (new com.pdomingo.data_structures.implementations.list.ArrayList.Node[newCapacity]));
    java.lang.System.arraycopy(data, 0, newArray, 0, data.length);
    data = newArray;
    capacity = newCapacity;
}