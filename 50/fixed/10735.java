public void setChildren(java.util.List<E> children) {
    for (E child : children) {
        checkChild(child);
    }
    this.children = new java.util.ArrayList<>(children);
}