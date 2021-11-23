@java.lang.Override
public java.util.List subList(int fromIndex, int toIndex) {
    com.slon.MyList list = new com.slon.MyList();
    list.head = getNode(fromIndex);
    list.tail = getNode(toIndex);
    list.size = (toIndex - fromIndex) + 1;
    return list;
}