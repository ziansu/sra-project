private icpc.problems.problemC.Node insert(icpc.problems.problemC.Node current, int number) {
    if (current == null)
        return createNode(number);
    else {
        if (number <= (current.number))
            current.leftChild = insert(current.leftChild, number);
        else
            current.rightChild = insert(current.rightChild, number);
        
        return current;
    }
}