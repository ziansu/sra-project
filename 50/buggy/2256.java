public void addChild(final org.gufroan.wearwolf.data.Node<T> childNode) {
    if ((children) == null) {
        children = new java.util.ArrayList<>();
    }
    children.add(childNode);
}