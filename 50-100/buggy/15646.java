public void push(int value) {
    (currentHeight)++;
    Node newNode = new Node(value);
    if ((currentSubstack) == null) {
        currentSubstack = newNode;
        return ;
    }
    newNode.next = currentSubstack;
    currentSubstack = newNode;
    if ((currentHeight) == (maxHeight)) {
        stacks.add(currentSubstack);
        currentSubstack = null;
        currentHeight = 0;
    }
}