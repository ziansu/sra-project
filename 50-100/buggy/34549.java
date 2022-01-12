public void push(int data) {
    dataStack.push(data);
    if ((minValue.isEmpty()) || (data < (minValue.peek().intValue()))) {
        minValue.push(data);
    }
}