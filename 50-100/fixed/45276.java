public java.lang.String toString() {
    Node currentNode = first;
    java.lang.String buffer = "";
    while (currentNode != null) {
        buffer += (java.lang.String.valueOf(currentNode.getValue())) + " ";
        currentNode = currentNode.getNext();
    } 
    return buffer;
}