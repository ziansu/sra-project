public int removeFirst() {
    int data = dataArray[pointer];
    (size)--;
    checkSize();
    (pointer)--;
    return data;
}