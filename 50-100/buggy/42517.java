public int getHeight(GenericNode<java.lang.String> p) {
    int height = 0;
    for (GenericNode<java.lang.String> g : p.children) {
        height = java.lang.Math.max(height, (1 + (getHeight(g))));
    }
    return height;
}