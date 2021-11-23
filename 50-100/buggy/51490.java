@java.lang.Override
public java.lang.String toString() {
    gameLogic.DLLNode node = gameLogic.DoublyLinkedList.FIRST;
    java.lang.String output = "";
    do {
        output = output + (node.toString());
        if ((node.getNext()) == null)
            break;
        
    } while (true );
    return output;
}