protected Node[] copyKids(Node[] array, int manyItems, int length) throws java.lang.CloneNotSupportedException {
    Node[] temp = new Node[length];
    for (int i = 0; i < manyItems; i++) {
        temp[i] = array[i].deepCopy();
    }
    return temp;
}