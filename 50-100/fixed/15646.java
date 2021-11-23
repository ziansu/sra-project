public void push(int value) {
    (currentHeight)++;
    Node newNode = new Node(value);
    if ((currentSubstack) == null) {
        currentSubstack = newNode;
        return ;
    }
    if ((currentHeight) > (maxHeight)) {
        stacks.add(currentSubstack);
        currentSubstack = newNode;
        currentHeight = 1;
        return ;
    }
    newNode.next = currentSubstack;
    currentSubstack = newNode;
}