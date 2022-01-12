private void transfer() {
    int newCapacity = (2 * (capacity)) + 1;
    java.lang.Object[] temp = new java.lang.Object[newCapacity];
    int i = front;
    for (int j = 0; i != (rear); i = (i + 1) % (capacity) , j++) {
        temp[j] = data[i];
    }
    front = 0;
    rear = i;
    data = temp;
    capacity = newCapacity;
}