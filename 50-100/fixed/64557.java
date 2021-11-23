public T delete() {
    if ((size) == 0) {
        throw new java.util.NoSuchElementException();
    }else {
        T out = data[1];
        data[1] = null;
        for (int i = 0; i < (size); i++) {
            data[i] = data[(i + 1)];
        }
        (size)--;
        heapify();
        data[((size) + 1)] = null;
        return out;
    }
}