private void searchline(int line, int xPos) {
    editor.FastLinkedList.Node nodePtr = lineMap.get(line);
    while (((nodePtr.next) != null) && ((nodePtr.next.text.getX()) < xPos)) {
        nodePtr = nodePtr.next;
    } 
    textList.currentNode = nodePtr;
}