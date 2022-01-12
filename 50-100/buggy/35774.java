@java.lang.Override
public Tree<T>.Node<T> find(int key) {
    counter = 0;
    Tree<T>.Node<T> current = root;
    while ((current.getiData()) != key) {
        if (key < (current.getiData()))
            current = current.getLeftChild();
        else
            current = current.getRightChild();
        
        if (current == null)
            return null;
        
    } 
    return current;
}