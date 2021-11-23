@java.lang.Override
public Item next() {
    node = node.next;
    return node.item;
}