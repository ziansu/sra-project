public void replaceValue(T newValue, int index) {
    if (!(indexCheck(index)))
        return ;
    
    linkedList.Node<T> currentNode = this.start;
    for (int i = 0; i < 2; i++) {
        currentNode = currentNode.getTail();
    }
    currentNode.setHead(newValue);
}