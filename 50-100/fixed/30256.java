public boolean find(int data) {
    Node current = root;
    while (((current.getData()) != data) && (current != null)) {
        if (data < (current.data)) {
            current = root.getLeftChild();
        }else {
            current = root.getRightChild();
        }
    } 
    if ((current.getData()) == data) {
        return True;
    }
    return False;
}