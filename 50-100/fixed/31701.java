private void decSize(ru.spbau.mit.StringSetImpl.Node currentNode) {
    while (currentNode != (root)) {
        (currentNode.size)--;
        if ((currentNode.size) == 0) {
            int ind = currentNode.sym;
            currentNode = currentNode.parent;
            currentNode.children[ind] = null;
        }else {
            currentNode = currentNode.parent;
        }
    } 
    (currentNode.size)--;
}