@java.lang.Override
public boolean contains(java.lang.String element) {
    return ((element.length()) != 0) && (node.contains(element, 0));
}