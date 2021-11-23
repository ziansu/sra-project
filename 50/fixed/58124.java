public Ai.Node getFirst() {
    Ai.Node temp = this;
    while ((temp.lastNode) != null) {
        temp = temp.lastNode;
    } 
    return temp;
}