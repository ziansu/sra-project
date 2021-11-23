public int size() {
    int result = 0;
    stack.SingleNode counter = head;
    while ((counter.getNext()) != null) {
        result++;
        counter = counter.getNext();
    } 
    return result;
}