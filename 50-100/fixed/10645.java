@java.lang.Override
public java.lang.String toString() {
    if ((head) == null) {
        return null;
    }
    java.lang.StringBuffer sb = new java.lang.StringBuffer();
    com.badalchowdhary.datastructures.Node currentNode = head;
    while ((currentNode.getNext()) != null) {
        sb.append(((currentNode.getData()) + " -> "));
        currentNode = currentNode.getNext();
    } 
    sb.append(currentNode.getData());
    return sb.toString();
}