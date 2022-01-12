public boolean find(int data) {
    Node current = root;
    if ((current.getData()) == data) {
        return True;
    }
    while (((current.getData()) != data) && (current != null)) {
        if (data < (current.data)) {
            current = root.getLeftChild();
        }else {
            current = root.getRightChild();
        }
    } 
    return False;
}