private int getNextConsumerIndex() {
    int size = consumers.size();
    if (1 == size) {
        return 0;
    }
    return (java.lang.Math.abs(((count)++))) % size;
}