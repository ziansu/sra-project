public java.lang.String toString() {
    Node currentNode = first;
    java.lang.String buffer = "";
    do {
        buffer += (java.lang.String.valueOf(currentNode.getValue())) + " ";
        currentNode = currentNode.getNext();
    } while (currentNode != null );
    return buffer;
}