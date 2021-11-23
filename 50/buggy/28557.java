public int getNumberOfCompletedInstances() {
    int count = 0;
    int size = size();
    for (int i = 0; i < size; i++) {
        if (hasInstance(i)) {
            count++;
        }
    }
    return count;
}