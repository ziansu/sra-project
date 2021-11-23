public boolean find(int data) {
    Node current = root;
    if ((current.getData()) == data) {
        return true;
    }
    while (((current.getData()) != data) && (current != null)) {
        if (data < (current.data)) {
            current = current.getLeftChild();
        }else {
            current = current.getRightChild();
        }
    } 
    return false;
}