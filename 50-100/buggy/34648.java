public boolean push(T data) {
    if ((firstNode) == null) {
        Stack<T>.Node firstNode = new Node(null, data, null);
        lastNode = firstNode;
        (numberOfDigits)++;
        return true;
    }else {
        Stack<T>.Node newNode = new Node(lastNode, data, null);
        lastNode.next = newNode;
        lastNode = newNode;
        (numberOfDigits)++;
        return true;
    }
}