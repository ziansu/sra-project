private void transfer() {
    int newCapacity = (2 * (capacity)) + 1;
    java.lang.Object[] temp = new java.lang.Object[newCapacity];
    for (int j = 0; (front) != (rear); front = ((front) + 1) % (capacity) , j++) {
        temp[j] = data[front];
    }
    rear = size;
    front = 0;
    data = temp;
    capacity = newCapacity;
}