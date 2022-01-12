private void searchline(int line, int xPos) {
    editor.FastLinkedList.Node nodePtr = lineMap.get(line);
    while (((nodePtr.next.text.getX()) < xPos) && ((nodePtr.next) != null)) {
        nodePtr = nodePtr.next;
    } 
    textList.currentNode = nodePtr;
}