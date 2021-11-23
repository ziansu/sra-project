protected oop.ex4.data_structures.Node getNodeWithVal(int searchVal) {
    oop.ex4.data_structures.Node current = myRoot;
    oop.ex4.data_structures.Node last = null;
    while (current != null) {
        if (searchVal == (current.getKey())) {
            return current;
        }else {
            last = current;
            if (searchVal < (current.getKey())) {
                current = current.getLeft();
            }else {
                current = current.getRight();
            }
        }
    } 
    return last;
}