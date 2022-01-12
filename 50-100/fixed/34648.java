public boolean push(T data) {
    if ((firstNode) == null) {
        firstNode = new Node(null, data, lastNode);
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