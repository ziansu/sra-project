public boolean removeAll() {
    for (int i = 0; i < (children.size()); i++) {
        if ((children.get(i)) != null) {
            ((edu.virginia.engine.display.DisplayObjectContainer) (children.get(i))).removeAll();
        }
    }
    children.clear();
    return children.isEmpty();
}