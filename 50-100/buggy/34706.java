public boolean removeAll() {
    for (int i = 0; i < (children.size()); i++) {
        ((edu.virginia.engine.display.DisplayObjectContainer) (children.get(i))).removeAll();
    }
    children.clear();
    return children.isEmpty();
}