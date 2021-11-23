public java.util.List<Node> getAllChildNodes() {
    java.util.List<Node> children = new java.util.ArrayList<Node>();
    for (int i = 0; i < (pancakes.size()); i++) {
        children.add(this.flip(i));
    }
    return children;
}