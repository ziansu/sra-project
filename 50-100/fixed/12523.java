@java.lang.SuppressWarnings(value = "null")
public void insertAt(int item, int pos) {
    int i = 1;
    Node newNode = new Node();
    newNode.data = item;
    newNode.next = null;
    Node temp;
    temp = head;
    while (i < (pos - 1)) {
        i++;
        temp = temp.next;
    } 
    newNode.next = temp.next;
    temp.next = newNode;
}