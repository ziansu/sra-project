@java.lang.Override
public Item next() {
    Item result = node.item;
    node = node.next;
    return result;
}