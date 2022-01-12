void add(java.lang.String CharTyped) {
    sg.util.FastLinkedList.Node newNode = new sg.util.FastLinkedList.Node(null, null, null);
    newNode.nodeText = new javafx.scene.text.Text(sg.util.FastLinkedList.INITIAL_TEXT_POSITION_X, sg.util.FastLinkedList.INITIAL_TEXT_POSITION_Y, CharTyped);
    if (isEmpty()) {
        sentinal.next = newNode;
        newNode.pre = newNode;
    }else {
        newNode.pre = currentNode;
        newNode.next = currentNode.next;
        if ((currentNode.next) != null) {
            currentNode.next.pre = newNode;
        }
        currentNode.next = newNode;
    }
    size += 1;
    currentNode = newNode;
}