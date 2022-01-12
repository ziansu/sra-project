private com.coding.basic.LinkedList binaryTreeSort(com.coding.basic.LinkedList list) {
    if (list == null) {
        return null;
    }
    com.coding.basic.Iterator listItr = list.iterator();
    com.coding.basic.BinaryTreeNode root = new com.coding.basic.BinaryTreeNode();
    while (listItr.hasNext()) {
        root.insert(listItr.next());
    } 
    com.coding.basic.LinkedList sortedList = new com.coding.basic.LinkedList();
    addNodeToLinkedList(sortedList, root);
    return sortedList;
}