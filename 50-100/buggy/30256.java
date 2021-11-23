public boolean find(int data) {
    Node current = root;
    while (((current.data) != data) && (current != null)) {
        if (data < (current.data)) {
            current = root.getLeftChild();
        }else {
            current = root.getRightChild();
        }
    } 
    if ((current.data) == data) {
        return True;
    }
    return False;
}