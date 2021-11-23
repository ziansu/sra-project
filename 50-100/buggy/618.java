private void resize(int capacity) {
    ArrayHeap<T>.Node[] temp = new ArrayHeap.Node[capacity];
    for (int i = 1; i <= (temp.length); i++) {
        temp[i] = contents[i];
    }
    contents = temp;
}