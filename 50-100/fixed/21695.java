protected oop.ex4.data_structures.Node getNodeWithVal(int searchVal) {
    oop.ex4.data_structures.Node current = myRoot;
    while (current != null) {
        if (searchVal == (current.getKey())) {
            return current;
        }else {
            if (searchVal < (current.getKey())) {
                current = current.getLeft();
            }else {
                current = current.getRight();
            }
        }
    } 
    return null;
}