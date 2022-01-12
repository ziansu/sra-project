@java.lang.Override
public java.lang.String toString() {
    gameLogic.DLLNode node = gameLogic.DoublyLinkedList.FIRST;
    java.lang.String output = "";
    do {
        output = output + (node.toString());
        java.lang.System.out.println(output);
        if ((node.getNext()) == null)
            break;
        
        node = node.getNext();
    } while (true );
    return output;
}